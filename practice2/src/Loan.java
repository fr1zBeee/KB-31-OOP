public class Loan {
    String loanId;
    double amount;
    boolean active;
    boolean paidOff;
    boolean overdue;

    public Loan() {
    }

    public Loan(String loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
        this.active = true;
        this.paidOff = false;
        this.overdue = false;
    }

    public boolean isPaidOff() { return false; }
    public boolean isOverdue() { return false; }
    public boolean isActive() { return false; }

    public String toString() {
        return "Loan{loanId='" + loanId + "', amount=" + amount + ", active=" + active + ", paidOff=" + paidOff + ", overdue=" + overdue + "}";
    }
}
