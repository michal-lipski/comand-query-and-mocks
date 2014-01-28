package outgoing_command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

//OUTGOING COMMAND METHOD
public class FlyingSaucerTest {


    //BAD WAY
    @Test
    public void shooting_enemy_inflicting_damage_on_its_health() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        SpaceShip enemy = new SpaceShip();

        flyingSaucer.shoot(enemy);

        assertThat(enemy.getHealth()).isEqualTo(50);
    }








    //GOOD WAY
    @Test
    public void shooting_enemy_inflicting_damage_equals_to_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        SpaceShip enemy = mock(SpaceShip.class);

        flyingSaucer.shoot(enemy);

        verify(enemy).inflictDamage(50);
    }

}
