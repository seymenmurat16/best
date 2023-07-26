package com.best.main.enums;

public enum TransactionStatus {
  NEW((short) 1, "Yeni İşlem"),
  TAKEN((short) 2, "İşleme alındı"),
  DONE((short) 3, "Tamamlandı"),
  REJECT((short) 4, "Red");

  private final short id;
  private final String statusName;

  TransactionStatus(short id, String statusName) {
    this.id = id;
    this.statusName = statusName;
  }

  public short getId() {
    return id;
  }

  public String getStatusName() {
    return statusName;
  }
}
