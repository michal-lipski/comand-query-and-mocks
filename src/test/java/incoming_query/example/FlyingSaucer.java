package incoming_query.example;


public class FlyingSaucer {

    Armory armory;
    int flyingSaucerPower;

    public FlyingSaucer(int flyingSaucerPower, int gunPower) {
        this.flyingSaucerPower = flyingSaucerPower;
        armory = new Armory(gunPower);
    }

    public int getPower() {
        return flyingSaucerPower * armory.getGunPower();
    }

}
