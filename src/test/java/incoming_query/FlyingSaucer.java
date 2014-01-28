package incoming_query;


public class FlyingSaucer {

    Machinery machinery;
    int flyingSaucerPower;

    public FlyingSaucer(int flyingSaucerPower, int gunPower) {
        this.flyingSaucerPower = flyingSaucerPower;
        machinery = new Machinery(gunPower);
    }

    public int getPower() {
        return flyingSaucerPower * machinery.getGunPower();
    }

}
