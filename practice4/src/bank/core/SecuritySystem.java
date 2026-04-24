package bank.core;

public class SecuritySystem extends BaseClientEntity {
    protected boolean locked;

    public SecuritySystem(String title) {
        super(title);
        this.locked = false;
    }

    public void lockSystem() {
        locked = true;
        System.out.println("SecuritySystem.lockSystem(): " + title);
    }

    public void showInfo() { System.out.println("SecuritySystem.showInfo(): " + title + ", locked=" + locked); }
    public void process() { System.out.println("SecuritySystem.process(): fraud monitoring"); }
    public String toString() { return "SecuritySystem{title='" + title + "', locked=" + locked + "}"; }
}
