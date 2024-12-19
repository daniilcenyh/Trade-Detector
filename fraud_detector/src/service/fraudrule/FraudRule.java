package service.fraudrule;

import service.Transaction;

public interface FraudRule {
    boolean isFraud(Transaction transaction);
    String getRuleName();
}
