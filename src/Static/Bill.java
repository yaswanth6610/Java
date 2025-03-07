package Static;

public class Bill {
    static int counter;
    private String billId;
    private String paymentMode;

    static {
        counter = 9000;
    }

    public Bill(String paymentMode){
        this.paymentMode = paymentMode;
        this.billId = "B"+ getCounter();
    }

    public int getCounter(){
        return ++counter;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}