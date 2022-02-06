package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    @Test
    public void services_rendered_Cost() {

        //Arrange
        Customer customer = new Customer("Joe", "Smith", "777-7777");
        Map<String, Double> servicesImplemented = new HashMap<String, Double>();
        servicesImplemented.put("Grooming", 5.00);
        servicesImplemented.put("Walking", 5000.00);
        servicesImplemented.put("Sitting", 10.00);

        //Act
        double balanceDue = customer.getBalanceDue(servicesImplemented);

        //Assert
        Assert.assertEquals(5015.00, balanceDue, 0.000);

    }





}
