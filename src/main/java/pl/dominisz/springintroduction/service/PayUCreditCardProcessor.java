package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class PayUCreditCardProcessor implements CreditCardProcessor {

  private Random random = new Random();

  @Override
  public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
    int number = random.nextInt(3);

    if (number == 1) {
      System.out.println("Card " + creditCard.getNumber() + " charged for " + amount);
      return new ChargeResult(true, "");
    } else if (number == 2) {
      System.out.println("Card " + creditCard.getNumber() + " charge failed");
      return new ChargeResult(false, "Empty account");
    } else {
      throw new UnreachableException("PayU server not responding");
    }
  }
}
