package org.deepandshallow;

public class Address {
    private String streetNumber;
    private String areaCode;

    public Address() {

    }

    public Address(String streetNumber, String areaCode) {
        this.streetNumber = streetNumber;
        this.areaCode = areaCode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", areaCode='" + areaCode + '\'' +
                '}';
    }
}
