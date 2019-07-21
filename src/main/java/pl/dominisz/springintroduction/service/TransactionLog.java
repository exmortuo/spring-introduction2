package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

public interface TransactionLog {
    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException exception);
}
