package bank.core;

public class Notification extends BaseClientEntity {
    protected String message;
    protected boolean delivered;

    public Notification(String title, String message) {
        super(title);
        this.message = message;
        this.delivered = false;
    }

    public void send() {
        delivered = true;
        System.out.println("Notification.send(): " + message);
    }

    public void showInfo() { System.out.println("Notification.showInfo(): " + title + ", delivered=" + delivered); }
    public void process() { System.out.println("Notification.process(): sending notification"); }
    public String toString() { return "Notification{title='" + title + "', message='" + message + "', delivered=" + delivered + "}"; }
}
