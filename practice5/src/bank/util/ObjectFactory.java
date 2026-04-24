package bank.util;

import bank.core.*;
import bank.storage.BankDataStore;

public class ObjectFactory {
    public static User createUser(String shortName, String email, String firstName, String lastName) {
        User user = new User(shortName, email, new User.NameInfo(firstName, lastName));
        BankDataStore.users.add(user);
        return user;
    }

    public static SecuritySystem createSecuritySystem(String title) {
        SecuritySystem item = new SecuritySystem(title);
        BankDataStore.securitySystems.add(item);
        return item;
    }

    public static Notification createNotification(String title, String message) {
        Notification item = new Notification(title, message);
        BankDataStore.notifications.add(item);
        return item;
    }

    public static BankAccount createBankAccount(String id, double amount) {
        BankAccount item = new BankAccount(id, amount);
        BankDataStore.accounts.add(item);
        return item;
    }

    public static Loan createLoan(String id, double amount) {
        Loan item = new Loan(id, amount);
        BankDataStore.loans.add(item);
        return item;
    }

    public static Payment createPayment(String id, double amount) {
        Payment item = new Payment(id, amount);
        BankDataStore.payments.add(item);
        return item;
    }

    public static Transaction createTransaction(String code, double amount) {
        Transaction item = new Transaction(code, amount);
        BankDataStore.transactions.add(item);
        return item;
    }

    public static BankCard createBankCard(String code, String cardNumber) {
        BankCard item = new BankCard(code, cardNumber);
        BankDataStore.cards.add(item);
        return item;
    }
}
