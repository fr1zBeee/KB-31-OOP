package bank.core;

public class BankCard extends OperationEntity {
    protected String cardNumber;

    public BankCard(String code, String cardNumber) {
        super(code);
        this.cardNumber = cardNumber;
    }

    public void blockCard() {
        status = "Blocked";
        System.out.println("BankCard.blockCard(): " + cardNumber);
    }

    public void showInfo() { System.out.println("BankCard.showInfo(): " + cardNumber + ", status=" + status); }
    public void process() { System.out.println("BankCard.process(): card verification"); }
    public String toString() { return "BankCard{code='" + code + "', cardNumber='" + cardNumber + "', status='" + status + "'}"; }
}
