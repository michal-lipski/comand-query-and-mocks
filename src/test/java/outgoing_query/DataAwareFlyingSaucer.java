package outgoing_query;


import org.joda.time.DateTime;

public class DataAwareFlyingSaucer {

    private double scannerData;
    private DateTime time;

    public DataAwareFlyingSaucer(double scannerData, DateTime time) {
        this.scannerData = scannerData;
        this.time = time;
    }

    public String gatherData() {
        return String.valueOf(scannerData + time.getYear());
    }
}
