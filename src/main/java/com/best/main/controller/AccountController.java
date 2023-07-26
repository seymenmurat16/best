package com.best.main.controller;

import com.best.main.client.PanelClient;
import com.best.main.dto.response.ResponseGetAccountForNewTransaction;
import com.best.main.dto.response.ResponseGetBanks;
import com.best.main.dto.response.ResponseGetHavaleAccounts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts")
public class AccountController {

  private final PanelClient panelClient;

  public AccountController(PanelClient panelClient) {
    this.panelClient = panelClient;
  }

  @GetMapping("/havale/{tokenRequest}")
  public ResponseEntity<ResponseGetHavaleAccounts> getHavaleAccounts(@PathVariable String tokenRequest) {
    ResponseGetHavaleAccounts response = panelClient.getHavaleAccounts(tokenRequest);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/newTransaction/{tokenRequest}")
  public ResponseEntity<ResponseGetAccountForNewTransaction> getAccountForNewTransaction(@PathVariable String tokenRequest) {
    ResponseGetAccountForNewTransaction response = panelClient.getAccountForNewTransaction(tokenRequest);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/banks")
  public ResponseEntity<ResponseGetBanks> getBanks() {
    ResponseGetBanks response = panelClient.getBanks();
    return ResponseEntity.ok(response);
  }
}
