package outgoing_query;


public class FlyingSaucer {

    private Scanner scanner;

    public FlyingSaucer(Scanner scanner) {
        this.scanner = scanner;
    }

    public String gatherData() {
        return String.valueOf(scanner.getData());
    }
}
