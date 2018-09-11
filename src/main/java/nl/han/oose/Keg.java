package nl.han.oose;

public class Keg {

    private int remainingVolumeInMl;

    public Keg(int capacityInMl) {
        this.remainingVolumeInMl = capacityInMl;
    }

    public synchronized int tap(int volumeInMl) {
        if (volumeInMl > this.remainingVolumeInMl) {
            volumeInMl = this.remainingVolumeInMl;
        }
        this.remainingVolumeInMl -= volumeInMl;
        return volumeInMl;
    }

    public int getRemainingVolume() {
        return this.remainingVolumeInMl;
    }


}
