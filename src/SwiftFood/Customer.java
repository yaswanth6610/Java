package SwiftFood;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerNumber;
    private Address customerAddress;

    public Customer(){}

    //constructor for Registered customers

    public Customer(int id, String name, String number, Address address) {
        this.customerId = id;
        this.customerName = name;
        this.customerNumber = number;
        this.customerAddress = address;
    }

    // constructor for non-registered customer

    public Customer(String name, String number, Address address) {
        this.customerName = name;
        this.customerNumber = number;
        this.customerAddress = address;
    }


    //Getter and Setter

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }


    // To display the customer details

    public void displayCustomerDetails(){
        System.out.println("Displaying customer details: ");
        System.out.println("CustomerId: "+ customerId);
        System.out.println("CustomerName: "+ customerName);
        System.out.println("CustomerNumber: "+ customerNumber);
        System.out.println("CustomerAddress: "+ customerAddress);
    }

    // Method to update all the details of the customer

    public void updateCustomerDetails(String name, String number, Address address) {
        this.customerName = name;
        this.customerNumber = number;
        this.customerAddress = address;
        System.out.println("Details has been successfully updated");
    }

    //Pay bill method

    public void payBill(double amount) {
        System.out.println("I need to pay this: " + amount);
    }
}


