package org.example;

import java.util.Date;

public class Stout extends CraftBeer {

    private String typeOfMaltUsed;

    public Stout(String name, double alcoholPercentage, Date dateOfManufacture, String typeOfMaltUsed) {
        super(name, alcoholPercentage, dateOfManufacture);
        this.typeOfMaltUsed = typeOfMaltUsed;
    }

    public String getTypeOfMaltUsed() {
        return typeOfMaltUsed;
    }

    public void setTypeOfMaltUsed(String typeOfMaltUsed) {
        this.typeOfMaltUsed = typeOfMaltUsed;
    }

    @Override
    public String toString() {
        return "type of malt used: " + typeOfMaltUsed;
    }

    public Stout manufacturingStout(String typeOfMaltUsed) {
        Stout stout = null;
        return stout;
    }
}
