package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    
    String birthday;
    String serialNumber;
    String issueDate;
    String org;
    Passport ivanovPassport;
    Passport smithPassport;
    
    
        public Passport(String birthday, String serialNumber, String issueDate, String org) {
        this.birthday = birthday;
        this.serialNumber = serialNumber;
        this.issueDate = issueDate;
        this.org = org;
        }      
    public Passport() {
        this("21.03.2019", "серия номер", "11.03.2019г.", "РУВД"); 
        
        }     
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public String getOrg() {
        return org;
    }
    public void setOrg(String org) {
        this.org = org;
    }
        
        
        
        
        
        
}
