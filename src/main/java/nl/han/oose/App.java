package nl.han.oose;

public class App {

    public static void main(String[] args) {
        Party party = new Party();
        party.addGuest("Uwe");
        party.addGuest("Ricky");
        party.addGuest("Julian");
        party.addGuest("Wout");
        party.addGuest("Peter");
        party.getStarted();

        System.out.println("Party ended.");
    }
}
