package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Purpose - Add a contact in Address Book System
 * @author Sreelipta
 * @since 2021-08-14
 */

public class AddressBookMain {
    ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);

    /**
     * This method is used to add details to address book
     */
    public void addDetails() {
        Contacts info = new Contacts();
        System.out.println("Enter the first name-");
        info.setFirstName(sc.nextLine());
        System.out.println("Enter the last name-");
        info.setLastName(sc.nextLine());
        System.out.println("Enter the address-");
        info.setAddress(sc.nextLine());
        System.out.println("Enter the city-");
        info.setCity(sc.nextLine());
        System.out.println("Enter the state-");
        info.setState(sc.nextLine());
        System.out.println("Enter the email-");
        info.setEmail(sc.nextLine());
        System.out.println("Enter the zip code-");
        info.setZip(sc.nextInt());
        System.out.println("Enter the phone number-");
        info.setPhoneNumber(sc.nextLong());
        arrayDetails.add(info);
        sc.close();
    }

    /**
     * This method displays the added contact
     */
    public void display() {
        System.out.println(arrayDetails);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain details = new AddressBookMain();
        details.addDetails();
        details.display();
    }
}
class Contacts {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;

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

    public String toString() {
        return ("First name: " + firstName +"\n"+" Last name: " + lastName +"\n" +" Address: " + address + "\n"+" city: " + city
                +"\n"+ " state: " + state +"\n"+ " email: " + email +"\n" +" zip: " + zip +"\n"+ " phone number:" + phoneNumber +"\n" );
    }
}




