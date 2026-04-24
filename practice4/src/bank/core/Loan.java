package bank.core;

public class Loan extends FinancialEntity {
    protected boolean overdue;

    public Loan(String id, double amount) {
        super(id, amount);
        this.overdue = false;
    }

    public void payPart(double value) {
        amount -= value;
        System.out.println("Loan.payPart(): " + value);
    }

    public void showInfo() { System.out.println("Loan.showInfo(): " + id + ", remaining=" + amount); }
    public void process() { System.out.println("Loan.process(): loan control"); }
    public String toString() { return "Loan{id='" + id + "', amount=" + amount + ", overdue=" + overdue + "}"; }
}
