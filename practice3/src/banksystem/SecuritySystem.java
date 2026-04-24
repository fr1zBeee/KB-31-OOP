package banksystem;

public class SecuritySystem {
    private boolean authenticated;
    private boolean locked;
    private boolean fraudDetected;

    public boolean isAuthenticated() { return authenticated; }
    public boolean isLocked() { return locked; }
    public boolean isFraudulent() { return fraudDetected; }

    public void authenticateUser(User user) {
        if (!user.isBlocked()) {
            authenticated = true;
            System.out.println("SecuritySystem.authenticateUser(): " + user.getName());
            user.internalCheck();
        }
    }

    public void checkFraud(Transaction transaction) {
        fraudDetected = transaction.getAmount() > 10000;
        System.out.println("SecuritySystem.checkFraud(): " + fraudDetected);
        transaction.printInternalStatus();
    }

    public void inspectAccount(BankAccount account) {
        account.internalAudit();
    }

    public void lockSystem() {
        locked = true;
        System.out.println("SecuritySystem.lockSystem()");
    }

    protected void printSecurityState() {
        System.out.println("SecuritySystem.printSecurityState(): authenticated=" + authenticated + ", locked=" + locked);
    }

    public String toString() {
        return "SecuritySystem{authenticated=" + authenticated + ", locked=" + locked + ", fraudDetected=" + fraudDetected + "}";
    }
}
