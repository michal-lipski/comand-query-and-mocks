package outgoing_query;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.joda.time.DateTime.now;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//OUTGOING QUERY METHOD
public class FlyingSaucerTest {


    private final DateTime currentYear = DateTime.now().withYear(2014);

    @Test
    public void gathers_data_from_scanner() {
        Scanner scanner = mock(Scanner.class);
        when(scanner.getData()).thenReturn(2.0);
        Timer timer = mock(Timer.class);
        when(timer.getTime()).thenReturn(currentYear);
        FlyingSaucer flyingSaucer = new FlyingSaucer(scanner, timer);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("2016.0");
    }

















    //BETTER WAY - we are independent of Scanner we only use data that we need. Some other tie-together class that will
    //              have to fetch data and make it available for DataAwareFlyingSaucer.
    //              Its job will be to simply execute commands and glue other classes together.
    //              Maybe we will not need to test it at all?
    @Test
    public void gathers_data_() {
        DataAwareFlyingSaucer flyingSaucer = new DataAwareFlyingSaucer(2.0, currentYear);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("2016.0");
    }


}
