package nl.han.oose;

public class BeerDrinker implements Runnable {

    private static final int VOLUME_GLASS = 200;
    private String name;
    private Party party;
    private int consumedBeer = 0;

    public BeerDrinker(String name, Party party) {
        this.name = name;
        this.party = party;
    }

    public void tapBeer() {
        this.consumedBeer += party.getGrolsch().tap(VOLUME_GLASS);
        System.out.println(this.name + " tapped a glass.");
    }

    public int getConsumedBeer() {
        return consumedBeer;
    }

    @Override
    public void run() {
        while (party.getGrolsch().getRemainingVolume() > 0) {
            tapBeer();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        party.finishedDrinking(this);
    }

    public String getName() {
        return name;
    }
}
