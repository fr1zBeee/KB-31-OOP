package bank.core;

public class User extends BaseClientEntity {
    protected String email;

    public static class NameInfo {
        private String firstName;
        private String lastName;

        public NameInfo(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String toString() { return firstName + " " + lastName; }
    }

    private NameInfo nameInfo;

    public User(String title, String email, NameInfo nameInfo) {
        super(title);
        this.email = email;
        this.nameInfo = nameInfo;
    }

    public void showInfo() { System.out.println("User.showInfo(): " + title + ", " + email + ", " + nameInfo); }
    public void changeEmail(String newEmail) { email = newEmail; System.out.println("User.changeEmail(): " + newEmail); }
    public String toString() { return "User{title='" + title + "', email='" + email + "', fullName=" + nameInfo + "}"; }
}
