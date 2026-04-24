package bank.core;

public class Transaction extends OperationEntity {
    protected double amount;

    public Transaction(String code, double amount) {
        super(code);
        this.amount = amount;
    }

    public void completeTransaction() {
        status = "Successful";
        System.out.println("Transaction.completeTransaction(): " + code);
    }

    public void showInfo() { System.out.println("Transaction.showInfo(): " + code + ", amount=" + amount + ", status=" + status); }
    public void process() { System.out.println("Transaction.process(): processing transaction"); }
    public String toString() { return "Transaction{code='" + code + "', amount=" + amount + ", status='" + status + "'}"; }
}
