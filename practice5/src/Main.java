import bank.core.*;
import bank.storage.BankDataStore;
import bank.util.ObjectFactory;

public class Main {
    public static void main(String[] args) {
        BaseClientEntity.printClassInfo();
        FinancialEntity.printClassInfo();
        OperationEntity.printClassInfo();

        User user = ObjectFactory.createUser("Timur", "timur@mail.com", "Timur", "Bondarenko");
        SecuritySystem security = ObjectFactory.createSecuritySystem("Main Security");
        Notification notification = ObjectFactory.createNotification("Info", "Payment successful");
        BankAccount account = ObjectFactory.createBankAccount("ACC001", 5000);
        Loan loan = ObjectFactory.createLoan("LN001", 12000);
        Payment payment = ObjectFactory.createPayment("PAY001", 700);
        Transaction transaction = ObjectFactory.createTransaction("TR001", 2000);
        BankCard card = ObjectFactory.createBankCard("CARD001", "1111222233334444");

        user.showInfo();
        user.changeEmail("timur.bondarenko@mail.com");
        security.lockSystem();
        notification.send();
        account.deposit(1000);
        loan.payPart(3000);
        payment.confirmPayment();
        transaction.completeTransaction();
        card.blockCard();

        System.out.println("\n---- STATIC COUNTERS ----");
        System.out.println("BaseClientEntity objects: " + BaseClientEntity.getObjectCount());
        System.out.println("FinancialEntity objects: " + FinancialEntity.getObjectCount());
        System.out.println("OperationEntity objects: " + OperationEntity.getObjectCount());

        System.out.println("\n---- DATA STORE ----");
        BankDataStore.printAllData();
    }
}
