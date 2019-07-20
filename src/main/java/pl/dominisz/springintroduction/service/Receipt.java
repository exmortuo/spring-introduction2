package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

public class Receipt {
  private BigDecimal amount;
  private boolean successful;
  private String message;

  public Receipt(BigDecimal amount, boolean successful, String message) {
    this.amount = amount;
    this.successful = successful;
    this.message = message;
  }

  public Receipt(BigDecimal amount) {
    this.amount = amount;
    this.successful = true;
    this.message = "";
  }

  public static Receipt forSuccessfulCharge(BigDecimal amount) {
    return new Receipt(amount);
  }

  public static Receipt forDeclinedCharge(String declineMessage) {
    // TODO można zrobić do tego odpowiedni konstruktor
    return new Receipt(BigDecimal.ZERO, false, declineMessage);
  }

  public static Receipt forSystemFailure(String message) {
    return new Receipt(BigDecimal.ZERO, false, message);
  }

  public String toString() {
      if (successful) {
          return "Charge successful: " + amount;
      } else {
          return "Charge failed: " + message;
      }
  }
}
