package com.best.main.controller;

import com.best.main.client.PanelClient;
import com.best.main.dto.request.RequestCreateTransaction;
import com.best.main.dto.response.ResponseCheckClientUserHasWithdrawRequest;
import com.best.main.dto.response.ResponseCreateTransaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transactions")
public class TransactionController {

  private final PanelClient panelClient;

  public TransactionController(PanelClient panelClient) {
    this.panelClient = panelClient;
  }
  @PostMapping()
  public ResponseEntity<ResponseCreateTransaction> createTransaction(@RequestBody RequestCreateTransaction request) {
    ResponseCreateTransaction response = panelClient.createTransaction(request);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/checkWithdrawRequest/{token}")
  public ResponseEntity<ResponseCheckClientUserHasWithdrawRequest> checkClientUserHasWithdrawRequest(@PathVariable String token) {
    ResponseCheckClientUserHasWithdrawRequest response = panelClient.checkWithdrawRequest(token);
    return ResponseEntity.ok(response);
  }
}
