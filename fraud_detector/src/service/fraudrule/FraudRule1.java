package service.fraudrule;

import service.Trader;
import service.Transaction;

public class FraudRule1 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
//        System.out.println("its rule 1");
//        System.out.println(this.getClass().toString());
        return transaction.getAmount() > 1000000;
    }

    @Override
    public String getRuleName() {
        return "Fraud rule 1";
    }
}
