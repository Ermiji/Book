package com.company;

public class Author {
    private String fName;
    private String lName;
    private String eAddress;
    private String phoneNumber;

    public Author(){

    }

    public Author(String fName, String lName, String eAddress, String phoneNumber){
        this.fName = fName;
        this.lName = lName;
        this.eAddress = eAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //make string method and call it on main class
}
