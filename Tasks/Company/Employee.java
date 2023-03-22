package org.Tasks.Company;

public class Employee {
    private String name;
    private String surname;
    private String email;
    private String phoneNo;
    Employee(String name, String surname, String email, String phoneNo){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String toString(){
        return this.getName()  + this.getSurname();
    }
}
