package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    
    String fullAddress;
    String city;
    String street;
    String houseNumber;
    String numberOfApartments;
    Address ivanovAddress;
    Address smithAddress;
   
    public Address(String fullAddress, String numberOfApartments, String houseNumber,
            String street, String city) {

        this.fullAddress = fullAddress;
        this.numberOfApartments = numberOfApartments;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        
    }

    public Address() {
        this("прописка", "квартира", "дом", "улица", "город");

}    

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String registration) {
        this.fullAddress = fullAddress;
        this.fullAddress = numberOfApartments +  houseNumber + street + city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(String numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
    
}
  