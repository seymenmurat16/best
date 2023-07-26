package com.best.main.enums;

public enum TransactionType {
  WITHDRAW(1),
  DEPOSIT(2);

  private Integer id;

  TransactionType(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }
}
