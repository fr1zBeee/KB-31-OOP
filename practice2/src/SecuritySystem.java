public class SecuritySystem {
    boolean authenticated;
    boolean fraudulent;
    boolean locked;

    public SecuritySystem() {
        this.authenticated = false;
        this.fraudulent = false;
        this.locked = false;
    }

    public boolean isAuthenticated() { return false; }
    public boolean isFraudulent() { return false; }
    public boolean isLocked() { return false; }

    public String toString() {
        return "SecuritySystem{authenticated=" + authenticated + ", fraudulent=" + fraudulent + ", locked=" + locked + "}";
    }
}
