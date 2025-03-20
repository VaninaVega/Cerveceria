package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Beer {

    private List<CraftBeer> beers;

    public Beer() {
        this.beers = new ArrayList<>();
    }


    public void addBeer(CraftBeer beer) {
        beers.add(beer);
    }

    public List<CraftBeer> GetBeerOrderByAlcoholPercentage() {
        return beers.stream()
                .sorted(Comparator.comparingDouble(CraftBeer::getAlcoholPercentage).reversed())
                .toList();
    }

}
