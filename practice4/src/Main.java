import bank.core.*;
import bank.extra.ExternalAudit;

public class Main {
    public static void main(String[] args) {
        User user = new User("Timur", "timur@mail.com");
        SecuritySystem security = new SecuritySystem("Bank Security");
        Notification notification = new Notification("Info", "Payment successful");

        BankAccount account = new BankAccount("ACC001", 5000);
        Loan loan = new Loan("LN001", 12000);
        Payment payment = new Payment("PAY001", 700);

        Transaction transaction = new Transaction("TR001", 1500);
        BankCard card = new BankCard("CARD001", "1111222233334444");

        BaseClientEntity[] clients = {user, security, notification};
        FinancialEntity[] financials = {account, loan, payment};
        OperationEntity[] operations = {transaction, card};

        for (BaseClientEntity item : clients) {
            item.showInfo();
            item.process();
        }
        for (FinancialEntity item : financials) {
            item.showInfo();
            item.process();
        }
        for (OperationEntity item : operations) {
            item.showInfo();
            item.process();
        }

        account.deposit(1000);
        loan.payPart(2000);
        payment.confirmPayment();
        transaction.completeTransaction();
        card.blockCard();
        notification.send();
        security.lockSystem();
        user.blockUser();

        InternalService service = new InternalService();
        service.inspectAll(user, account, transaction);

        ExternalAudit audit = new ExternalAudit();
        audit.audit(user);

        System.out.println(user);
        System.out.println(security);
        System.out.println(notification);
        System.out.println(account);
        System.out.println(loan);
        System.out.println(payment);
        System.out.println(transaction);
        System.out.println(card);
    }
}
