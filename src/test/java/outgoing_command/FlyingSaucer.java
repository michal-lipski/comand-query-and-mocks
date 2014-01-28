package outgoing_command;


public class FlyingSaucer {

    int flyingSaucerPower;
    int gunPower;

    public FlyingSaucer(int flyingSaucerPower, int gunPower) {
        this.flyingSaucerPower = flyingSaucerPower;
        this.gunPower = gunPower;
    }

    public int getPower() {
        return flyingSaucerPower * gunPower;
    }

    public void shoot(SpaceShip enemy) {
        enemy.inflictDamage(getPower());
    }

}
