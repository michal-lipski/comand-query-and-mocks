package outgoing_command;


public class SpaceShip {

    int health = 100;
    int shields = 0;

    public void inflictDamage(int damage) {
        int actualDamage = damage - shields;
        health -= actualDamage;
    }

    public int getHealth() {
        return health;
    }
}
