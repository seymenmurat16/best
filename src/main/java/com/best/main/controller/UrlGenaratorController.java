package com.best.main.controller;

import com.best.main.client.PanelClient;
import com.best.main.dto.request.RequestGenerateToken;
import com.best.main.dto.request.RequestGenerateTokenGeneral;
import com.best.main.dto.response.ResponseGenerateTokenThenReturnUrl;
import com.best.main.enums.PaymentType;
import com.best.main.enums.TransactionType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/url")
public class UrlGenaratorController {

  private final PanelClient panelClient;

  public UrlGenaratorController(PanelClient panelClient) {
    this.panelClient = panelClient;
  }

  @PostMapping("/bjk/fast")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolFast1(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        1L, TransactionType.DEPOSIT, PaymentType.FAST);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/bjk/havale")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolHavale1(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        1L, TransactionType.DEPOSIT, PaymentType.HAVALE);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/bjk/withdraw")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolWithdraw1(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        1L, TransactionType.WITHDRAW, null);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/gs/fast")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolFast2(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        2L, TransactionType.DEPOSIT, PaymentType.FAST);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/gs/havale")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolHavale2(RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        2L, TransactionType.DEPOSIT, PaymentType.HAVALE);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/gs/withdraw")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolWithdraw2(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        2L, TransactionType.WITHDRAW, null);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }


  @PostMapping("/fb/fast")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolFast3(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        3L, TransactionType.DEPOSIT, PaymentType.FAST);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/fb/havale")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolHavale3(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        3L, TransactionType.DEPOSIT, PaymentType.HAVALE);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/fb/withdraw")
  public ResponseEntity<ResponseGenerateTokenThenReturnUrl> generateTokenTrendyolWithdraw3(@RequestBody RequestGenerateToken request) {
    RequestGenerateTokenGeneral requestGenerateTokenGeneral = new RequestGenerateTokenGeneral(request.getUsername(), request.getName(), request.getClientsCash(),
        3L, TransactionType.WITHDRAW, null);
    ResponseGenerateTokenThenReturnUrl response = panelClient.generateToken(requestGenerateTokenGeneral);
    return ResponseEntity.ok(response);
  }


}
