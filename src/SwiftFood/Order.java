package SwiftFood;

import java.sql.SQLOutput;

public class Order {
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;

    //Constructor

    public Order () {
        this.status = "Ordered";
    }

    // constructor with parameters

    public Order (int id, String foodName, double price) {
        this.orderId = id;
        this.orderedFoods = foodName;
        this.totalPrice = price;
        this.status = "Ordered";
    }


    // Calculating the Total price with Service charge

    public double calculateTotalPrice(int unitPrice){
        double servieCharge = (this.totalPrice * 5)/100;
        this.totalPrice += servieCharge;
        return this.totalPrice;
    }

    public void orderDetails() {
        System.out.println("Order details: ");
        System.out.println("Order Id: " + getOrderId());
        System.out.println("Ordered Food: " + getOrderedFoods());
        System.out.println("Order status: " + getStatus());
        System.out.println("Total price: " + getTotalPrice());
    }

    //Getter and setter

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(String orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
