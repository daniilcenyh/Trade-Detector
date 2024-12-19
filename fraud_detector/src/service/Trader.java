package service;

public class Trader {

    private String fullName;
    private String city;
    private Countries country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public Countries getCountry() {
        return country;
    }
}
