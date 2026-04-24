package bank.core;

public class User extends BaseClientEntity {
    protected String email;
    protected boolean blocked;

    public User(String title, String email) {
        super(title);
        this.email = email;
        this.blocked = false;
    }

    public void blockUser() {
        blocked = true;
        active = false;
        System.out.println("User.blockUser(): " + title);
    }

    public void showInfo() { System.out.println("User.showInfo(): " + title + ", " + email); }
    public void process() { System.out.println("User.process(): authorization for " + title); }
    public String toString() { return "User{title='" + title + "', email='" + email + "', blocked=" + blocked + "}"; }
}
