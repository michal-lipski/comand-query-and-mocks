package outgoing_query;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//OUTGOING QUERY METHOD
public class FlyingSaucerTest {


    @Test
    public void gathers_data_from_scanner() {
        //we need those two ugly lines to stub scanner
        Scanner scanner = mock(Scanner.class);
        when(scanner.getData()).thenReturn(1.5);
        FlyingSaucer flyingSaucer = new FlyingSaucer(scanner);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("1.5");
    }









    //BETTER WAY - we are independent of Scanner we only use data that we need. Some other tie-together class that will
    //              have to fetch data and mak it available for DataAwareFlyingSaucer.
    //              Its job will be to simply execute commands and glue other classes together.
    //              Maybe we will not need to test it at all?
    @Test
    public void gathers_data_() {
        DataAwareFlyingSaucer flyingSaucer = new DataAwareFlyingSaucer(1.5);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("1.5");
    }




}
