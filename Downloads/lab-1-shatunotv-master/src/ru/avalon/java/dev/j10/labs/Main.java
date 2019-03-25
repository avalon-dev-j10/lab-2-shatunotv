package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

class Main  {

    Person ivanov = null;
    Person smith = null;

    
public static void main(String args[]) {
    
    Person ivanov =new Person("Иван", false, true, "Иванов");
    Person smith = new Person("John", true, false, "Smith");
    
    Passport ivanovPassport = new Passport("11.11.2011", "1111 111111", 
            "11.11.2019г.", "РУВД города Санкт-Петербурга");
    Passport smithPassport = new Passport("22.02.2012", "2222 222222", 
            "22.02.2019г.", "РУВД города Москва");
    
    Address ivanovAddress = new Address("прописан и проживает:", " 111", " 11",
            " Первая", " Санкт-Петербург");
    Address smithAddress = new Address("прописан и проживает:", " 222", " 22",
            " Вторая", " Москва");
   
   System.out.println(ivanov.name + " " + true + true + " " + ivanov.surName);
   
   System.out.println(ivanovPassport.getBirthday() + " года рождения, паспорт"
           + " " + ivanovPassport.getSerialNumber()  + 
           ", выдан " + ivanovPassport.getIssueDate() + " " + 
           ivanovPassport.getOrg() + ", " + ivanovAddress.getFullAddress()
           + " кв." + ivanovAddress.getNumberOfApartments() + ", дом" + 
           ivanovAddress.getHouseNumber() + ", ул." + ivanovAddress.getStreet()
           + ", г." + ivanovAddress.getCity() +".");
    
   System.out.println(smith.name + " " + true + false + " " + smith.surName);
      
   System.out.println(smithPassport.getBirthday() + " года рождения, паспорт " 
           + smithPassport.getSerialNumber()  + 
           ", выдан " + smithPassport.getIssueDate() + " " + 
           smithPassport.getOrg() + ", " + smithAddress.getFullAddress() + 
           " кв." + smithAddress.getNumberOfApartments() + ", дом" + 
           smithAddress.getHouseNumber() + ", ул." + smithAddress.getStreet()
           + ", г." + smithAddress.getCity() +".");
   
        }   
 
}