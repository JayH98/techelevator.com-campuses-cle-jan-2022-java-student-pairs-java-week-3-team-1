package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<String>();

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}
    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}
    public List<String> getVaccinations() {return vaccinations;}
    public void setVaccinations(List<String> vaccinations) {this.vaccinations = vaccinations;}

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }
    String vaccinesList= "";
    public String listVaccinations() {
        for (int i = 0; i < vaccinations.size()-1; i++) {
           vaccinesList+= vaccinations.get(i) + ", ";

        }
       vaccinesList += vaccinations.get(vaccinations.size()-1);
        return vaccinesList;
    }


}
