package incoming_command;


public class FlyingSaucer {

    int flyingSaucerPower;
    private int gunPower;

    public FlyingSaucer(int flyingSaucerPower, int gunPower) {
        this.flyingSaucerPower = flyingSaucerPower;
        this.gunPower = gunPower;
    }

    public int getPower() {
        return flyingSaucerPower * gunPower;
    }

    public void upgradeGun(int additionalPower) {
        gunPower += additionalPower;
    }

}
