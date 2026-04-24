package banksystem;

public class Loan {
    private String loanId;
    private double amount;
    private boolean active;
    private boolean paidOff;
    private boolean overdue;

    public Loan(String loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
        this.active = true;
        this.paidOff = false;
        this.overdue = false;
    }

    public String getLoanId() { return loanId; }
    public double getAmount() { return amount; }
    public boolean isActive() { return active; }
    public boolean isPaidOff() { return paidOff; }
    public boolean isOverdue() { return overdue; }

    public void payPart(double payment) {
        if (payment > 0 && active) {
            amount -= payment;
            System.out.println("Loan.payPart(): " + payment);
            if (amount <= 0) {
                amount = 0;
                paidOff = true;
                active = false;
            }
        }
    }

    public void setOverdue() {
        overdue = true;
        System.out.println("Loan.setOverdue(): " + loanId);
    }

    public void closeLoan() {
        amount = 0;
        paidOff = true;
        active = false;
        System.out.println("Loan.closeLoan(): " + loanId);
    }

    void internalLoanCheck() {
        System.out.println("Loan.internalLoanCheck(): " + loanId);
    }

    public String toString() {
        return "Loan{loanId='" + loanId + "', amount=" + amount + ", active=" + active + ", paidOff=" + paidOff + ", overdue=" + overdue + "}";
    }
}
