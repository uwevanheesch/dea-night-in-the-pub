package nl.han.oose;

public class BeerDrinker implements Runnable {

    private static final int VOLUME_GLAS = 200;
    private String name;
    private Keg keg;

    private int consumedBeer = 0;

    public BeerDrinker(String name, Keg keg) {
        this.name = name;
        this.keg = keg;
    }

    public void tapBeer() {
        consumedBeer += keg.tap(VOLUME_GLAS);
        System.out.println(this.name + " tapped a glas.");
    }


    public int getConsumedBeer() {
        return consumedBeer;
    }

    @Override
    public void run() {

        while (keg.getRemainingVolume() > 0) {
            tapBeer();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + " drank " + consumedBeer + "ml.");

    }
}
