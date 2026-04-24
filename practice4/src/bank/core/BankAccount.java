package bank.core;

public class BankAccount extends FinancialEntity {
    protected boolean blocked;

    public BankAccount(String id, double amount) {
        super(id, amount);
        this.blocked = false;
    }

    public void deposit(double value) {
        amount += value;
        System.out.println("BankAccount.deposit(): " + value);
    }

    public void showInfo() { System.out.println("BankAccount.showInfo(): " + id + ", balance=" + amount); }
    public void process() { System.out.println("BankAccount.process(): account maintenance"); }
    public String toString() { return "BankAccount{id='" + id + "', balance=" + amount + ", blocked=" + blocked + "}"; }
}
