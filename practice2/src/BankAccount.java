public class BankAccount {
    String accountNumber;
    double balance;
    boolean active;
    boolean blocked;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.active = true;
        this.blocked = false;
    }

    public boolean isActive() { return false; }
    public boolean hasFunds() { return false; }
    public boolean isBlocked() { return false; }

    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + ", active=" + active + ", blocked=" + blocked + "}";
    }
}
