package service;


import service.fraudrule.*;

import java.util.HashSet;
import java.util.List;

public class FraudDetector {

    private HashSet<Trader> fraudTraderList;
    private HashSet<String> fraudCityList;
    private HashSet<Countries> fraudCountryList;


    // fraud rules
    private List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5()
    );


    public HashSet<Trader> getFraudTraderList() {
        return fraudTraderList;
    }

    public HashSet<String> getFraudCityList() {
        return fraudCityList;
    }

    public HashSet<Countries> getFraudCountryList() {
        return fraudCountryList;
    }

    FraudDetectionResult isFraud(Transaction transaction) {

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.getRuleName();
                return new FraudDetectionResult(true, ruleName);
            }
        }

        return new FraudDetectionResult(false, null);
    }

    public void addFraudTraderToList(Trader trader) {
        fraudTraderList.add(trader);
    }
    public void addFraudCityToList(String city) {
        fraudCityList.add(city);
    }
    public void addFraudCountryToList(Countries country) {
        fraudCountryList.add(country);
    }

}
