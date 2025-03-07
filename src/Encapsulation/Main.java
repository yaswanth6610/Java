package Encapsulation;

public class Main {
    public static void main(String[] args) {
        MovieTicket movie1 = new MovieTicket(113, 2);
        movie1.setCostPerTicket(8.5);

        System.out.println(movie1.calculateTotalAmount());



    }
}
