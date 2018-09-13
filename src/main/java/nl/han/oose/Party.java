package nl.han.oose;

import java.util.ArrayList;
import java.util.List;

public class Party {

    private Keg keg;
    private List<String> guests;

    public Party() {
        keg = new Keg(50000);
        guests = new ArrayList<>();
    }

    public void addGuest(String name) {
        guests.add(name);
    }

    public void getStarted() {
        for (String guest : guests) {
            new Thread(new BeerDrinker(guest, this)).start();
        }

        System.out.println("Party ended");
    }

    public void callBack(){
        System.out.println("Callback called");
        // You can use this method to determine whether all threads have finished
    }

    public Keg getKeg() {
        return keg;
    }
}
