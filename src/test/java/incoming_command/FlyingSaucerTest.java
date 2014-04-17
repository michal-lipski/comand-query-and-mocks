package incoming_command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FlyingSaucerTest {

    @Test
    public void should_upgrade_gun_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        flyingSaucer.upgradeGun(5);

        //assert on public state change
        assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }
}
