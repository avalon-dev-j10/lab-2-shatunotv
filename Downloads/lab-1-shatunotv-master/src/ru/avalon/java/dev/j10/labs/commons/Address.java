package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    String fullAddress;
    String city;
    String street;
    String houseNumber;
    String numberOfApartments;
    Address ivanovAddress;
    Address smithAddress;
   
    public Address(String numberOfApartments, String houseNumber,
            String street, String city) {

        
        this.numberOfApartments = numberOfApartments;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        
    }

   

    public String getFullAddress() {
        return "прописан и проживает:" + " кв." + numberOfApartments + ", дом" + houseNumber + ", ул." + 
                street + ", г." + city;
    }

   public void setFullAddress() {
        
   
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
  