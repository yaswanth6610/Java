package CabService;

import java.util.Objects;

public class CabServiceProvider {
    private String cabServiceName;
    private int totalCab;

    public CabServiceProvider(String cabServiceName, int totalCab) {
        this.cabServiceName = cabServiceName;
        this.totalCab = totalCab;
    }

    // Calculate reward price for driver
    public double calculateRewardPrice(Driver driver){
        float rating = driver.getAvgRating();
        if (Objects.equals(this.cabServiceName, "Halo")) {
            if (rating >= 4.5) return 10 * rating;
            if( (rating > 4.0 && rating < 4.5) ) { return 5 * rating; }
            else return 0.0;
        }
        else {
            if (rating >= 4.5) return 8 * rating;
            if( (rating > 4.0 && rating < 4.5) ) { return 3 * rating; }
            else return 0.0;
        }
    }

    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCab() {
        return totalCab;
    }

    public void setTotalCab(int totalCab) {
        this.totalCab = totalCab;
    }
}
