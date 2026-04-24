package bank.core;

public class Payment extends FinancialEntity {
    protected boolean paid;

    public Payment(String id, double amount) {
        super(id, amount);
        this.paid = false;
    }

    public void confirmPayment() {
        paid = true;
        System.out.println("Payment.confirmPayment(): " + id);
    }

    public void showInfo() { System.out.println("Payment.showInfo(): " + id + ", paid=" + paid); }
    public void process() { System.out.println("Payment.process(): payment operation"); }
    public String toString() { return "Payment{id='" + id + "', amount=" + amount + ", paid=" + paid + "}"; }
}
