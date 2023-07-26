package com.best.main.client;

import static com.best.main.constants.Constants.ORIGIN_NAME;

import com.best.main.dto.request.RequestCreateTransaction;
import com.best.main.dto.request.RequestGenerateTokenGeneral;
import com.best.main.dto.response.ResponseCheckClientUserHasWithdrawRequest;
import com.best.main.dto.response.ResponseCreateTransaction;
import com.best.main.dto.response.ResponseGenerateTokenThenReturnUrl;
import com.best.main.dto.response.ResponseGetAccountForNewTransaction;
import com.best.main.dto.response.ResponseGetBanks;
import com.best.main.dto.response.ResponseGetHavaleAccounts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PanelClient {

  private static final String GENERATE_TOKEN = "/v1/token/url";
  private static final String GET_HAVALE_ACCOUNTS = "/v1/accounts/havale/";
  private static final String GET_ACCOUNT_FOR_NEW_TRANSACTION = "/v1/accounts/newTransaction/";
  private static final String GET_BANKS = "/v1/accounts/banks";
  private static final String IS_VALID_TOKEN = "/v1/token/isValid/";
  private static final String CREATE_TRANSACTION = "/v1/transactions";
  private static final String CHECK_WITHDRAW_REQUEST = "/v1/transactions/checkWithdrawRequest/";

  Logger logger = LoggerFactory.getLogger(PanelClient.class);

  private final WebClient webClient;

  public PanelClient(@Value("${back-end.endpoint}") String baseUrl) {
    this.webClient = WebClient.builder().baseUrl(baseUrl).defaultHeader(HttpHeaders.ORIGIN, ORIGIN_NAME)
        .build();
  }

  public ResponseGenerateTokenThenReturnUrl generateToken(RequestGenerateTokenGeneral request) {
    return webClient
        .post()
        .uri(GENERATE_TOKEN)
        .body(Mono.just(request), RequestGenerateTokenGeneral.class)
        .retrieve()
        .bodyToMono(ResponseGenerateTokenThenReturnUrl.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public ResponseCreateTransaction createTransaction(RequestCreateTransaction request) {
    return webClient
        .post()
        .uri(CREATE_TRANSACTION)
        .body(Mono.just(request), RequestCreateTransaction.class)
        .retrieve()
        .bodyToMono(ResponseCreateTransaction.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public ResponseGetHavaleAccounts getHavaleAccounts(String token) {
    return webClient
        .get()
        .uri(GET_HAVALE_ACCOUNTS + token)
        .retrieve()
        .bodyToMono(ResponseGetHavaleAccounts.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public ResponseGetAccountForNewTransaction getAccountForNewTransaction(String token) {
    return webClient
        .get()
        .uri(GET_ACCOUNT_FOR_NEW_TRANSACTION + token)
        .retrieve()
        .bodyToMono(ResponseGetAccountForNewTransaction.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public Boolean isValidToken(String token) {
    return webClient
        .get()
        .uri(IS_VALID_TOKEN + token)
        .retrieve()
        .bodyToMono(Boolean.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public ResponseCheckClientUserHasWithdrawRequest checkWithdrawRequest(String token) {
    return webClient
        .get()
        .uri(CHECK_WITHDRAW_REQUEST + token)
        .retrieve()
        .bodyToMono(ResponseCheckClientUserHasWithdrawRequest.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }

  public ResponseGetBanks getBanks() {
    return webClient
        .get()
        .uri(GET_BANKS)
        .retrieve()
        .bodyToMono(ResponseGetBanks.class)
        .doOnError(error -> logger.error("There is an error while sending request {}", error.getMessage()))
        .block();
  }
}
