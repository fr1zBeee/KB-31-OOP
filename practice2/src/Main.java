public class Main {
    public static void main(String[] args) {
        User user = new User("Timur", "timur@mail.com");
        BankAccount account = new BankAccount("UA123456789", 5000);
        Transaction transaction = new Transaction("TR001", 1200, "Created");
        BankCard card = new BankCard("1111222233334444", "12/27");
        SecuritySystem security = new SecuritySystem();
        Payment payment = new Payment("PAY001", 700, "Created");
        Notification notification = new Notification("Payment was successful");
        Loan loan = new Loan("LN001", 10000);

        System.out.println(user);
        System.out.println(account);
        System.out.println(transaction);
        System.out.println(card);
        System.out.println(security);
        System.out.println(payment);
        System.out.println(notification);
        System.out.println(loan);
    }
}
