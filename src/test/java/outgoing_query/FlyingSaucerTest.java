package outgoing_query;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//OUTGOING QUERY METHOD
public class FlyingSaucerTest {


    @Test
    public void gathers_data_from_scanner() {
        Scanner scanner = mock(Scanner.class);
        when(scanner.getData()).thenReturn(1.5);
        FlyingSaucer flyingSaucer = new FlyingSaucer(scanner);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("1.5");
    }









    //BETTER WAY
    @Test
    public void gathers_data_() {
        DataAwareFlyingSaucer flyingSaucer = new DataAwareFlyingSaucer(1.5);

        String data = flyingSaucer.gatherData();

        assertThat(data).isEqualTo("1.5");
    }




}
