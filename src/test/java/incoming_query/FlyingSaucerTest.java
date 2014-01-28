package incoming_query;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//INCOMING QUERY METHOD
public class FlyingSaucerTest {


    //BAD WAY
    @Test
    public void should_call_machinery_when_calculating_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.machinery = mock(Machinery.class);

        flyingSaucer.getPower();

        verify(flyingSaucer.machinery).getGunPower();
    }








    //ALSO BAD WAY
    @Test
    public void should_use_machinery_when_calculating_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.machinery = mock(Machinery.class);
        when(flyingSaucer.machinery.getGunPower()).thenReturn(10);

        flyingSaucer.getPower();

        assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }









    //GOOD WAY
    @Test
    public void should_calculate_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        int power = flyingSaucer.getPower();

        assertThat(power).isEqualTo(50);
    }


}
