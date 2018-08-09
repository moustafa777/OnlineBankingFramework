package com.mum.asd.OnlineBankingFramework.models;

public class Address {

    private String streetName;
    private String city;
    private String state;
    public Address(){}

    public Address(String stName,String city,String state){
        this.streetName=stName;
        this.city=city;
        this.state=state;
    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
