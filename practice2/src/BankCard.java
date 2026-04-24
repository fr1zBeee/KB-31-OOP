public class BankCard {
    String cardNumber;
    String expireDate;
    boolean blocked;

    public BankCard() {
    }

    public BankCard(String cardNumber, String expireDate) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.blocked = false;
    }

    public boolean isValid() { return false; }
    public boolean isBlocked() { return false; }
    public boolean isExpired() { return false; }

    public String toString() {
        return "BankCard{cardNumber='" + cardNumber + "', expireDate='" + expireDate + "', blocked=" + blocked + "}";
    }
}
