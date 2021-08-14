package com.addressbook;

/**
 * Purpose - Create an Address Book System
 * @author Sreelipta
 * @since 2021-08-14
 */

class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;

    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class AddressBookMain {
    public static void main(String[] args) {
        Contact details = new Contact("Sreelipta", "Sahoo", "CDA", "Cuttack", "Odisha", "sree@gmail.com", 753014, 1234567891);
        System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
        System.out.println("The address details you have created as: FirstName-" + details.getFirstName() +"\n"+"LastName-"
                + details.getLastName()+"\n" + " Address-" + details.getAddress()+"\n" + " City-" + details.getCity()+"\n"
                + " State-" + details.getState()+"\n" + " Email-" + details.getEmail()+"\n" + " Zip-" + details.getZip()+"\n"
                + " PhoneNumber-" + details.getPhoneNumber()+"\n");
    }
}

