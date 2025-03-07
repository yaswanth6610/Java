package CabService;

public class Driver {
    private String driverName;
    private float avgRating;

    public Driver(String driverName, float avgRating) {
        this.driverName = driverName;
        this.avgRating = avgRating;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(float avgRating) {
        this.avgRating = avgRating;
    }
}
