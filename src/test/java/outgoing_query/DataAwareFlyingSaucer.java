package outgoing_query;


public class DataAwareFlyingSaucer {

    private double scannerData;

    public DataAwareFlyingSaucer(double scannerData) {
        this.scannerData = scannerData;
    }

    public String gatherData() {
        return String.valueOf(scannerData);
    }
}
