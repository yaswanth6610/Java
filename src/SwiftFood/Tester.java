package SwiftFood;

public class Tester {
    public static void main(String[] args) {

        Address c1 = new Address("26","Narayanasamy street", "Chennai", 600130);

        Customer customer = new Customer("Yash", "6309428687", c1);

        customer.displayCustomerDetails();

/*
        Order order1 = new Order(101, "Biryani",200.0);

        order1.calculateTotalPrice(1);

        order1.orderDetails();


        Restaurant res = new Restaurant("Zeeshan", "+91554689", "navallur, 10th Street", 4.4F);

        res.displayRestaurentDetails();

        Order order2 = new Order();
        order2.orderDetails();
*/
    }
}
