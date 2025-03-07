package Static;

public class Main {
    public static void main(String[] args) {
        Bill bill1 = new Bill("Credit card");
        Bill bill2 = new Bill("Paypal");


        Bill[] bills = { bill1, bill2 };

        for (Bill bill:bills){
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}

