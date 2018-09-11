package nl.han.oose;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Keg grolsch = new Keg(50000);

        List<BeerDrinker> drinkers = new ArrayList<>();
        drinkers.add(new BeerDrinker("Uwe", grolsch));
        drinkers.add(new BeerDrinker("Hans", grolsch));
        drinkers.add(new BeerDrinker("Anne", grolsch));
        drinkers.add(new BeerDrinker("Peter", grolsch));
        drinkers.add(new BeerDrinker("Susanna", grolsch));

        for (BeerDrinker drinker : drinkers) {
            new Thread(drinker).start();
        }


    }
}
