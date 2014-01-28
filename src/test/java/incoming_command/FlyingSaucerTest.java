package incoming_command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//INCOMING COMMAND METHOD
public class FlyingSaucerTest {

    @Test
    public void should_upgrade_gun_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        flyingSaucer.upgradeGun(5);

        assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }
}
