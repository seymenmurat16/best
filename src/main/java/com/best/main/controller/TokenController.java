package com.best.main.controller;

import com.best.main.client.PanelClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/token")
public class TokenController {

  private final PanelClient panelClient;

  public TokenController(PanelClient panelClient) {
    this.panelClient = panelClient;
  }

  @GetMapping("/isValid/{token}")
  public ResponseEntity<Boolean> isValidToken(@PathVariable String token) {
    Boolean response = panelClient.isValidToken(token);
    return ResponseEntity.ok(response);
  }


}
