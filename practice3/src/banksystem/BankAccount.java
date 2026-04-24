package banksystem;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean active;
    private boolean blocked;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.active = true;
        this.blocked = false;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public boolean isActive() { return active; }
    public boolean isBlocked() { return blocked; }

    public void deposit(double amount) {
        if (amount > 0 && active && !blocked) {
            balance += amount;
            System.out.println("BankAccount.deposit(): " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount && active && !blocked) {
            balance -= amount;
            System.out.println("BankAccount.withdraw(): " + amount);
        }
    }

    public boolean hasFunds(double amount) {
        return balance >= amount;
    }

    public void blockAccount() {
        blocked = true;
        System.out.println("BankAccount.blockAccount(): " + accountNumber);
    }

    void internalAudit() {
        System.out.println("BankAccount.internalAudit(): " + accountNumber);
    }

    protected void printBalance() {
        System.out.println("BankAccount.printBalance(): " + balance);
    }

    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + ", active=" + active + ", blocked=" + blocked + "}";
    }
}
