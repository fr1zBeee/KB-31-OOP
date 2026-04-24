package banksystem;

public class Payment {
    private String paymentId;
    private double amount;
    private String status;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Created";
    }

    public String getPaymentId() { return paymentId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    public void confirmPayment() {
        status = "Paid";
        System.out.println("Payment.confirmPayment(): " + paymentId);
    }

    public void refundPayment() {
        status = "Refunded";
        System.out.println("Payment.refundPayment(): " + paymentId);
    }

    public void setPending() {
        status = "Pending";
        System.out.println("Payment.setPending(): " + paymentId);
    }

    public boolean isPaid() { return status.equals("Paid"); }
    public boolean isRefunded() { return status.equals("Refunded"); }
    public boolean isPending() { return status.equals("Pending"); }

    void printPaymentInsideSystem() {
        System.out.println("Payment.printPaymentInsideSystem(): " + status);
    }

    public String toString() {
        return "Payment{paymentId='" + paymentId + "', amount=" + amount + ", status='" + status + "'}";
    }
}
