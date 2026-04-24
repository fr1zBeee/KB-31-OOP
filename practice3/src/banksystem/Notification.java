package banksystem;

public class Notification {
    private String message;
    private boolean delivered;
    private boolean read;
    private boolean pending;

    public Notification(String message) {
        this.message = message;
        this.delivered = false;
        this.read = false;
        this.pending = true;
    }

    public String getMessage() { return message; }
    public boolean isDelivered() { return delivered; }
    public boolean isRead() { return read; }
    public boolean isPending() { return pending; }

    public void send() {
        delivered = true;
        pending = false;
        System.out.println("Notification.send(): " + message);
    }

    public void markAsRead() {
        if (delivered) {
            read = true;
            System.out.println("Notification.markAsRead()");
        }
    }

    void internalNotify() {
        System.out.println("Notification.internalNotify()");
    }

    public String toString() {
        return "Notification{message='" + message + "', delivered=" + delivered + ", read=" + read + ", pending=" + pending + "}";
    }
}
