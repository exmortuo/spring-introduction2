package pl.dominisz.springintroduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.model.Receipt;
import pl.dominisz.springintroduction.service.*;

import java.math.BigDecimal;

@ComponentScan
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

    BillingService billingService = context.getBean(BillingService.class);

    Order order = new Order(BigDecimal.TEN);
    CreditCard creditCard = new CreditCard("123456", "holder", "123", 1, 2020);

    Receipt receipt = billingService.chargeOrder(order, creditCard);

    System.out.println(receipt);
  }
}
