package org.example;

import java.util.Date;

public abstract class CraftBeer {
    private String name;
    private double alcoholPercentage;
    private Date dateOfManufacture;

    private enum packagingType {
        BOTTLE,
        CAN,
        KEG
    }

    public CraftBeer(String name, double alcoholPercentage, Date dateOfManufacture) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Craft Beer " +
                "name: " + name + '\'' +
                ", alcohol percentage: " + alcoholPercentage +
                ", date Of Manufacture: " + dateOfManufacture;
    }
}
