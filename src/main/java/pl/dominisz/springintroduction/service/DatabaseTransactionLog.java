package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

@Component
public class DatabaseTransactionLog implements TransactionLog {
  @Override
  public void logChargeResult(ChargeResult result) {}

  @Override
  public void logConnectException(UnreachableException exception) {}
}
