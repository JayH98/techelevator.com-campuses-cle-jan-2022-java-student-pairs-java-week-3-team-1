package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List pets;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List getPets() {
        return pets;
    }

    public void setPets(List pets) {
        this.pets = pets;
    }

    public Customer (String firstName, String lastName, String phoneNumber ) {
        super(firstName,lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer (String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    double balanceDue = 0.0;
    public double getBalanceDue(Map<String, Double> services) {
        for(Map.Entry<String, Double> service: services.entrySet()) {
          balanceDue += service.getValue();
        }
        return balanceDue;

    }





}
