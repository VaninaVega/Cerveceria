package org.example;

import java.util.Date;

public class Ipa extends CraftBeer{

    private int amountOfHops;

    public Ipa(String name, double alcoholPercentage, Date dateOfManufacture, int amountOfHops) {
        super(name, alcoholPercentage, dateOfManufacture);
        this.amountOfHops = amountOfHops;
    }

    public int getAmountOfHops() {
        return amountOfHops;
    }

    public void setAmountOfHops(int amountOfHops) {
        this.amountOfHops = amountOfHops;
    }

    @Override
    public String toString() {
        return "amount Of hops=" + amountOfHops;
    }

    public Ipa manufacturingIpa(int amountOfHops) {
        Ipa ipa = null;
        return ipa;
    }
}
