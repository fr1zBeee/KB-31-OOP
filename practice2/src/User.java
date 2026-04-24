public class User {
    String name;
    String email;
    boolean authorized;
    boolean blocked;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.authorized = false;
        this.blocked = false;
    }

    public boolean isAuthorized() { return false; }
    public boolean isValidEmail() { return false; }
    public boolean isBlocked() { return false; }

    public String toString() {
        return "User{name='" + name + "', email='" + email + "', authorized=" + authorized + ", blocked=" + blocked + "}";
    }
}
