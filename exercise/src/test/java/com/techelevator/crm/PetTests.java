package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    @Test
    public void listVaccinations_check() {
        //Arrange
        Pet pet = new Pet("name", "species");
        String[] vaccinationsToSet = {"rabies", "covid", "distemper"};
        pet.setVaccinations(List.of(vaccinationsToSet));
        //Act
        String vaccines = pet.listVaccinations();
        //Assert
        Assert.assertEquals("rabies, covid, distemper", vaccines);

    }



}
