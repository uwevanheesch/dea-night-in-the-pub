package nl.han.oose;

public class Keg {

    private final int capacityInMl;
    private int remainingVolume;

    public Keg(int capacityInMl) {
        this.capacityInMl = capacityInMl;
        this.remainingVolume = capacityInMl;
    }

    public synchronized int tap(int volume) {
        if (volume > this.remainingVolume) {
            volume = this.remainingVolume;
        }
        this.remainingVolume -= volume;
        return volume;
    }

    public int getRemainingVolume() {
        return this.remainingVolume;
    }
}
