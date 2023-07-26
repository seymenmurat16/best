package com.best.main.enums;

public enum Bank {
  GARANTI(1, "GARANTİ BANKASI"),
  ISBANKASI(2, "İŞ BANKASI"),
  AKBANK(3, "AKBANK"),
  ZIRAAT(4, "ZİRAAT BANKASI"),
  YKB(5, "YAPI VE KREDİ BANKASI"),
  HALKBANK(6, "HALKBANK"),
  VAKIFBANK(7, "VAKIFBANK"),
  QNB(8, "QNB FİNANSBANK"),
  DENIZ(9, "DENİZBANK"),
  TEB(10, "TÜRK EKONOMİ BANKASI"),
  ING(11, "ING BANK"),
  FIBA(12, "FİBABANKA"),
  ODEA(13, "ODEA BANK"),
  SEKERBANK(14, "ŞEKERBANK"),
  ALTERNATIF(15, "ALTERNATİFBANK"),
  BURGAN(16, "BURGAN BANK");

  private final int id;
  private final String bankName;

  Bank(int id, String bankName) {
    this.id = id;
    this.bankName = bankName;
  }

  public int getId() {
    return id;
  }

  public String getBankName() {
    return bankName;
  }
}

