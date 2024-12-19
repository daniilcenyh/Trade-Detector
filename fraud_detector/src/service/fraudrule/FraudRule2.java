package service.fraudrule;

import service.FraudDetector;
import service.Transaction;

public class FraudRule2 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        String city  = transaction.getTrader().getCity();
        FraudDetector fraudDetector = new FraudDetector();
//        System.out.println("its rule 2");
//        System.out.println(this.getClass().toString());
        return fraudDetector.getFraudCityList().contains(city);
    }

    @Override
    public String getRuleName() {
        return "Fraud rule 2";
    }
}
