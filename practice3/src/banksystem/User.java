package banksystem;

public class User {
    private String name;
    private String email;
    private boolean authorized;
    private boolean blocked;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.authorized = false;
        this.blocked = false;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean isAuthorized() { return authorized; }
    public boolean isBlocked() { return blocked; }

    public void authorize() {
        if (!blocked) {
            authorized = true;
            System.out.println("User.authorize(): " + name);
        }
    }

    public void changeEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            email = newEmail;
            System.out.println("User.changeEmail(): " + email);
        }
    }

    public void blockUser() {
        blocked = true;
        authorized = false;
        System.out.println("User.blockUser(): " + name);
    }

    void internalCheck() {
        System.out.println("User.internalCheck(): " + name);
    }

    protected void printShortInfo() {
        System.out.println("User.printShortInfo(): " + name + ", " + email);
    }

    public String toString() {
        return "User{name='" + name + "', email='" + email + "', authorized=" + authorized + ", blocked=" + blocked + "}";
    }
}
