package bank.core;

public class FinancialEntity {
    protected String id;
    protected double amount;
    protected static int objectCount = 0;

    public FinancialEntity(String id, double amount) {
        this.id = id;
        this.amount = amount;
        objectCount++;
    }

    public void showInfo() { System.out.println("FinancialEntity.showInfo(): " + id + ", amount=" + amount); }
    public static void printClassInfo() { System.out.println("FinancialEntity.printClassInfo(): base class for money entities"); }
    public static int getObjectCount() { return objectCount; }
}
