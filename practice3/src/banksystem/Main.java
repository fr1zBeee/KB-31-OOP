package banksystem;

public class Main {
    public static void main(String[] args) {
        User user = new User("Timur", "timur@mail.com");
        BankAccount account = new BankAccount("UA123456789", 5000);
        Transaction transaction = new Transaction("TR001", 1200);
        BankCard card = new BankCard("1111222233334444", "12/27");
        SecuritySystem security = new SecuritySystem();
        Payment payment = new Payment("PAY001", 700);
        Notification notification = new Notification("Payment was successful");
        Loan loan = new Loan("LN001", 10000);
        BankStorage storage = new BankStorage();

        user.authorize();
        user.changeEmail("timur.bondarenko@mail.com");
        account.deposit(1500);
        account.withdraw(800);
        account.printBalance();
        transaction.setPending();
        security.checkFraud(transaction);
        transaction.completeTransaction();
        card.checkCardInsideSystem();
        card.blockCard();
        card.unblockCard();
        security.authenticateUser(user);
        security.inspectAccount(account);
        security.printSecurityState();
        payment.setPending();
        payment.confirmPayment();
        payment.printPaymentInsideSystem();
        notification.send();
        notification.markAsRead();
        loan.payPart(2500);
        loan.internalLoanCheck();

        storage.addUser(user);
        storage.addAccount(account);
        storage.addCard(card);
        storage.addLoan(loan);
        storage.addNotification(notification);

        System.out.println("\n----- STORAGE DATA -----");
        storage.showAllUsers();
        storage.showAllAccounts();
        storage.showAllLoans();

        System.out.println("\n----- OBJECTS -----");
        System.out.println(user);
        System.out.println(account);
        System.out.println(transaction);
        System.out.println(card);
        System.out.println(security);
        System.out.println(payment);
        System.out.println(notification);
        System.out.println(loan);
        System.out.println(storage);
    }
}
