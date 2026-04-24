package banksystem;

public class Transaction {
    private String transactionId;
    private double amount;
    private String status;

    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = "Created";
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    public void completeTransaction() {
        status = "Successful";
        System.out.println("Transaction.completeTransaction(): " + transactionId);
    }

    public void setPending() {
        status = "Pending";
        System.out.println("Transaction.setPending(): " + transactionId);
    }

    public void cancelTransaction() {
        status = "Canceled";
        System.out.println("Transaction.cancelTransaction(): " + transactionId);
    }

    public boolean isSuccessful() { return status.equals("Successful"); }
    public boolean isPending() { return status.equals("Pending"); }
    public boolean isCanceled() { return status.equals("Canceled"); }

    void printInternalStatus() {
        System.out.println("Transaction.printInternalStatus(): " + status);
    }

    public String toString() {
        return "Transaction{transactionId='" + transactionId + "', amount=" + amount + ", status='" + status + "'}";
    }
}
