package service.fraudrule;

import service.Countries;
import service.FraudDetector;
import service.Transaction;

public class FraudRule5 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Countries country = transaction.getTrader().getCountry();
        FraudDetector fraudDetector = new FraudDetector();
//        System.out.println("its rule 5");
//        System.out.println(this.getClass().toString());
        return fraudDetector
                .getFraudCountryList()
                .contains(Countries.GERMANY) && (transaction.getAmount() > 1000);
    }

    @Override
    public String getRuleName() {
        return "Fraud rule 5";
    }
}
