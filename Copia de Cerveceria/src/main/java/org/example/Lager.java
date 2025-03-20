package org.example;

import java.util.Date;

public class Lager extends CraftBeer {
    private double fermentationTemperature;

    public Lager(String name, double alcoholPercentage, Date dateOfManufacture, double fermentationTemperature) {
        super(name, alcoholPercentage, dateOfManufacture);
        this.fermentationTemperature = fermentationTemperature;
    }

    public double getFermentationTemperature() {
        return fermentationTemperature;
    }

    public void setFermentationTemperature(double fermentationTemperature) {
        this.fermentationTemperature = fermentationTemperature;
    }

    @Override
    public String toString() {
        return "fermentation temperature: " + fermentationTemperature;
    }

    public Lager manufacturingLager(double fermentationTemperature) {
        Lager Lager = null;
        return Lager;
    }
}
