package bank.core;

public class FinancialEntity {
    protected String id;
    protected double amount;

    public FinancialEntity(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void showInfo() { System.out.println("FinancialEntity.showInfo(): " + id + ", amount=" + amount); }
    public void process() { System.out.println("FinancialEntity.process(): " + id); }
    void internalCheck() { System.out.println("FinancialEntity.internalCheck(): " + id); }

    public String toString() { return "FinancialEntity{id='" + id + "', amount=" + amount + "}"; }
}
