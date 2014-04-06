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
        double data = scanner.getData();
        DateTime time = timer.getTime();
        return String.valueOf(data + time.getYear());
    }
}
