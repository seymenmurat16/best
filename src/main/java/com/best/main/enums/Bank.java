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
  KUVEYT(12, "KUVEYT TÜRK"),
  HSBC(13, "HSBC"),
  TURFINANS(14, "TÜRKİYE FİNANS BANKASI"),
  ALBARAKA(15, "ALBARAKA TÜRK"),
  FIBA(16, "FİBABANKA"),
  ODEA(17, "ODEA BANK"),
  SEKERBANK(18, "ŞEKERBANK"),
  ALTERNATIF(19, "ALTERNATİFBANK"),
  AKTIF(20, "AKTİF BANK"),
  ANADOLU(21, "ANADOLU BANK"),
  BIRLESIK(22, "BİRLEŞİK FON BANKASI"),
  CITIBANK(23, "CITIBANK"),
  BURGAN(24, "BURGAN BANK");

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

