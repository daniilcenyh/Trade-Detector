package service.fraudrule;

import service.FraudDetector;
import service.Trader;
import service.Transaction;

public class FraudRule3 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        FraudDetector fraudDetector = new FraudDetector();
//        System.out.println("its rule 3");
//        System.out.println(this.getClass().toString());
        return fraudDetector.getFraudTraderList().contains(trader);
    }

    @Override
    public String getRuleName() {
        return "Fraud rule 3";
    }
}
