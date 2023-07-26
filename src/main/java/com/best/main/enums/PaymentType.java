package com.best.main.enums;

public enum PaymentType {
  FAST(1),
  HAVALE( 2);

  private Integer id;

  PaymentType(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }
}