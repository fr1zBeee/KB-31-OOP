public class Payment {
    String paymentId;
    double amount;
    String status;

    public Payment() {
    }

    public Payment(String paymentId, double amount, String status) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
    }

    public boolean isPaid() { return false; }
    public boolean isRefunded() { return false; }
    public boolean isPending() { return false; }

    public String toString() {
        return "Payment{paymentId='" + paymentId + "', amount=" + amount + ", status='" + status + "'}";
    }
}
