package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

public class Order {
  private BigDecimal amount;

  public Order(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
