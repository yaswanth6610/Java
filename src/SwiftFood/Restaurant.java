package SwiftFood;

public class Restaurant {
    private String restaurantName;
    private String restaurantContact;
    private String restaurantAddress;
    private float rating;

    // constructor

    public Restaurant(String name, String contact, String address, float rating) {
        this.restaurantName = name;
        this.restaurantContact = contact;
        this.restaurantAddress = address;
        this.rating = rating;
    }

    // Displaying the Restaurent Details

    public void displayRestaurentDetails() {
        System.out.println("Restaurant Details: ");
        System.out.println("Restaurant Name: " + getRestaurentName());
        System.out.println("Restaurant Contact: " + getRestaurentContact());
        System.out.println("Restaurant Address: " + getRestaurentAddress());
        System.out.println("Restaurant Rating: " + getRating());
    }

    public String getRestaurentName() {
        return restaurantName;
    }

    public void setRestaurentName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurentContact() {
        return restaurantContact;
    }

    public void setRestaurentContact(String restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public String getRestaurentAddress() {
        return restaurantAddress;
    }

    public void setRestaurentAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
