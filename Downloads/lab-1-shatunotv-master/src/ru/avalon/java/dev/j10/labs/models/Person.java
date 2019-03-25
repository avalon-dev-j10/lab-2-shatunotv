/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.models;

/**
 *
 * @author sany
 */
public class Person {
    public String name;
    public static Boolean secondName;
    public static Boolean fatherName;
    public String surName;
    public Person ivanov;
    public Person smith;
    public String fullName;

      public Person(String name, Boolean secondName, Boolean fatherName, String surName) {
        this.name = name;
        //this.secondName = secondName;
        //this.fatherName = fatherName;
        this.surName = surName;
    }
    public Person() {
        this("имя", true, false, "фамилия"); 
       
    }
    public static void info(Person smith, Person ivanov){
            String sString = null;
            String fString = null;
            
        
        if (secondName) {
            sString = "Edvard";
            fString = " ";
        } else if (fatherName) {
            sString = " ";
            fString = "Иванович";
        } else 
           sString = " ";
           fString = " ";
    

           
          // System.out.println(ivanov.name + " " + fString + ivanov.surName);
         //  System.out.println(smith.name + sString + " " + smith.surName);
        
      }    
    public String getName(){
        return name;
        
   }
    public void setName(String name) {
        this.name = name;
       ivanov.name = "Иван";
       smith.name = "John";
    }
    public Boolean isSecondName() {
        return secondName;
    }
    public void setSecondName(Boolean secondName) {
        this.secondName = secondName;
        ivanov.secondName = false;
        smith.secondName = true;
    }
     public Boolean isFatherName() {
        return fatherName;
    }

    public void setFatherName(Boolean fatherName) {
        this.fatherName = fatherName;
        ivanov.fatherName = true;
        smith.fatherName = false;
    }
   public String getSurName() {
        return surName;
   }
    public void setSurName(String surName) {
       this.surName = surName;
       smith.surName = "Smith";
       ivanov.surName = "Иванов";
        
    }
    public String getFullName(){
        return fullName;

    }
    public String setFullName(String fullName){ 
       // return name + secondName + fatherName + surName;
       this.fullName = fullName;
       //name + secondName + fatherName + surName;
       this.ivanov.fullName = name + " " + fatherName + surName;
       this.smith.fullName = name + secondName + " " + surName;
       return fullName;
       
    }
    

}