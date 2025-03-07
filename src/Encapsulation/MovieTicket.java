package Encapsulation;

public class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;


    public MovieTicket(int id, int seats) {
        this.movieId = id;
        this.noOfSeats = seats;
    }

    public double calculateTotalAmount() {
        return this.noOfSeats * this.costPerTicket;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
}
