public class Notification {
    String message;
    boolean delivered;
    boolean read;

    public Notification() {
    }

    public Notification(String message) {
        this.message = message;
        this.delivered = false;
        this.read = false;
    }

    public boolean isDelivered() { return false; }
    public boolean isRead() { return false; }
    public boolean isPending() { return false; }

    public String toString() {
        return "Notification{message='" + message + "', delivered=" + delivered + ", read=" + read + "}";
    }
}
