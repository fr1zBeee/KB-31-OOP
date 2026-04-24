package banksystem;

import java.util.ArrayList;
import java.util.List;

public class BankStorage {
    private List<User> users = new ArrayList<>();
    private List<BankAccount> accounts = new ArrayList<>();
    private List<BankCard> cards = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();
    private List<Notification> notifications = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("BankStorage.addUser(): " + user.getName());
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("BankStorage.addAccount(): " + account.getAccountNumber());
    }

    public void addCard(BankCard card) {
        cards.add(card);
        System.out.println("BankStorage.addCard(): " + card.getCardNumber());
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
        System.out.println("BankStorage.addLoan(): " + loan.getLoanId());
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
        notification.internalNotify();
        System.out.println("BankStorage.addNotification()");
    }

    public void showAllUsers() {
        for (User user : users) System.out.println(user);
    }

    public void showAllAccounts() {
        for (BankAccount account : accounts) System.out.println(account);
    }

    public void showAllLoans() {
        for (Loan loan : loans) System.out.println(loan);
    }

    public String toString() {
        return "BankStorage{users=" + users.size() + ", accounts=" + accounts.size() + ", cards=" + cards.size() + ", loans=" + loans.size() + ", notifications=" + notifications.size() + "}";
    }
}
