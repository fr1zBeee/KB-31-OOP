public class Transaction {
    String transactionId;
    double amount;
    String status;

    public Transaction() {
    }

    public Transaction(String transactionId, double amount, String status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
    }

    public boolean isSuccessful() { return false; }
    public boolean isPending() { return false; }
    public boolean isCanceled() { return false; }

    public String toString() {
        return "Transaction{transactionId='" + transactionId + "', amount=" + amount + ", status='" + status + "'}";
    }
}
