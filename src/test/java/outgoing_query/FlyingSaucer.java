package outgoing_query;


import org.joda.time.DateTime;

public class FlyingSaucer {

    private Scanner scanner;

    private Timer timer;

    public FlyingSaucer(Scanner scanner, Timer timer) {
        this.scanner = scanner;
        this.timer = timer;
    }

    public String gatherData() {
        int year = timer.getTime().getYear();
        double data = scanner.getData();

        return String.valueOf(data + year);
    }
}
