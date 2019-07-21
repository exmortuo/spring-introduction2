package pl.dominisz.springintroduction.model;

public class CreditCard {

  private String number;
  private String holder;
  private String verificationCode;
  private int month;
  private int year;

  public CreditCard(String number, String holder, String verificationCode, int month, int year) {
    this.number = number;
    this.holder = holder;
    this.verificationCode = verificationCode;
    this.month = month;
    this.year = year;
  }

  public String getNumber() {
      return number;
  }
}
