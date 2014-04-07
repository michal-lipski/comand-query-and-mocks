package incoming_query.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//INCOMING QUERY METHOD
public class FlyingSaucerTest {


    //BAD WAY - try to reafactor FlyingSaucer so that it will not use Machinery to store gunPower - test will fail
    //          even if functionality will be the same
    @Test
    public void should_call_machinery_when_calculating_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.armory = mock(Armory.class);

        flyingSaucer.getPower();

        verify(flyingSaucer.armory).getGunPower();
    }








    //ALSO BAD WAY
    @Test
    public void should_use_machinery_when_calculating_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);
        flyingSaucer.armory = mock(Armory.class);
        when(flyingSaucer.armory.getGunPower()).thenReturn(10);

        flyingSaucer.getPower();

        assertThat(flyingSaucer.getPower()).isEqualTo(100);
    }









    //GOOD WAY - test Query methods by that return value
    //           we are not connected with implementation details
    @Test
    public void should_calculate_power() {
        FlyingSaucer flyingSaucer = new FlyingSaucer(10, 5);

        int power = flyingSaucer.getPower();

        assertThat(power).isEqualTo(50);
    }


}
