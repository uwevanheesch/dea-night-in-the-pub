package nl.han.oose;

import java.util.ArrayList;
import java.util.List;

public class Party {

    private Keg grolsch;
    private List<String> guests;
    private int finishedGuests = 0;

    public Party() {
        grolsch = new Keg(50000);
        guests = new ArrayList<>();
    }

    public void addGuest(String name) {
        guests.add(name);
    }

    public void getStarted() {
        for (String guest : guests) {
            new Thread(new BeerDrinker(guest, this)).start();
        }
    }

    public void finishedDrinking(BeerDrinker drinker) {
        System.out.println(drinker.getName() + " drank " + drinker.getConsumedBeer() + "ml.");
        finishedGuests++;
        if (finishedGuests == guests.size()) {
            System.out.println("Party ends. No beer left.");
        }
    }

    public Keg getGrolsch() {
        return grolsch;
    }
}
