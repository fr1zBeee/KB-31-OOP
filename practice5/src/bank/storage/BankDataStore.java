package bank.storage;

import java.util.ArrayList;
import java.util.List;
import bank.core.*;

public class BankDataStore {
    public static List<User> users = new ArrayList<>();
    public static List<SecuritySystem> securitySystems = new ArrayList<>();
    public static List<Notification> notifications = new ArrayList<>();
    public static List<BankAccount> accounts = new ArrayList<>();
    public static List<Loan> loans = new ArrayList<>();
    public static List<Payment> payments = new ArrayList<>();
    public static List<Transaction> transactions = new ArrayList<>();
    public static List<BankCard> cards = new ArrayList<>();

    public static void printAllData() {
        System.out.println("---- USERS ----");
        for (User item : users) System.out.println(item);
        System.out.println("---- SECURITY SYSTEMS ----");
        for (SecuritySystem item : securitySystems) System.out.println(item);
        System.out.println("---- NOTIFICATIONS ----");
        for (Notification item : notifications) System.out.println(item);
        System.out.println("---- ACCOUNTS ----");
        for (BankAccount item : accounts) System.out.println(item);
        System.out.println("---- LOANS ----");
        for (Loan item : loans) System.out.println(item);
        System.out.println("---- PAYMENTS ----");
        for (Payment item : payments) System.out.println(item);
        System.out.println("---- TRANSACTIONS ----");
        for (Transaction item : transactions) System.out.println(item);
        System.out.println("---- CARDS ----");
        for (BankCard item : cards) System.out.println(item);
    }
}
