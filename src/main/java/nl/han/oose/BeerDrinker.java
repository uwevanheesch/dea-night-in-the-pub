package nl.han.oose;

public class BeerDrinker implements Runnable {

    private static final int VOLUME_GLAS = 200;

    private String name;
    private Party party;

    private int consumedBeer = 0;

    public BeerDrinker(String name, Party party) {
        this.name = name;
        this.party = party;
    }

    public void tapBeer() {
        consumedBeer += party.getKeg().tap(VOLUME_GLAS);
        System.out.println(this.name + " tapped a glas.");
    }


    public int getConsumedBeer() {
        return consumedBeer;
    }

    @Override
    public void run() {

        while (party.getKeg().getRemainingVolume() > 0) {
            tapBeer();
            // drink
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name + " drank " + consumedBeer + "ml.");

        party.callBack();
    }
}
