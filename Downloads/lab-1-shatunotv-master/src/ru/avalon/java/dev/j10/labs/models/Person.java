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
    public String secondName;
    public String fatherName;
    public String surName;
    public Person ivanov;
    public Person smith;
    public String fullName;

      public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public Person() {
      this("имя", "фамилия"); 
       
    }
     
   public String getFullName(){

        if (secondName != null) {
            return name  + " " + secondName.charAt(0) + ". " + surName;
        } else if (secondName == null && fatherName == null) {
            return name + " " + "" + surName;
        } else {
           return surName + " " + name + " " + fatherName;
        } 
    
      } 

    public String getName(){
        return name;
        
   }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;

    }
     public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;

    }
   public String getSurName() {
        return surName;
   }
    public void setSurName(String surName) {
       this.surName = surName;
    }
}