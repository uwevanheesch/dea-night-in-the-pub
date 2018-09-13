package nl.han.oose;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Party party = new Party();
        party.addGuest("Uwe");
        party.addGuest("Peter");
        party.addGuest("Hans");
        party.addGuest("Heinrich");
        party.addGuest("Klaus");

        party.getStarted();

    }
}
