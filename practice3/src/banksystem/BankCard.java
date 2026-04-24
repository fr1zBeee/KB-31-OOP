package banksystem;

public class BankCard {
    private String cardNumber;
    private String expireDate;
    private boolean blocked;

    public BankCard(String cardNumber, String expireDate) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.blocked = false;
    }

    public String getCardNumber() { return cardNumber; }
    public String getExpireDate() { return expireDate; }
    public boolean isBlocked() { return blocked; }

    public void blockCard() {
        blocked = true;
        System.out.println("BankCard.blockCard(): " + cardNumber);
    }

    public void unblockCard() {
        blocked = false;
        System.out.println("BankCard.unblockCard(): " + cardNumber);
    }

    public boolean isValid() {
        return cardNumber != null && cardNumber.length() >= 16 && !blocked;
    }

    public boolean isExpired() {
        return false;
    }

    void checkCardInsideSystem() {
        System.out.println("BankCard.checkCardInsideSystem(): " + cardNumber);
    }

    public String toString() {
        return "BankCard{cardNumber='" + cardNumber + "', expireDate='" + expireDate + "', blocked=" + blocked + "}";
    }
}
