package bank.core;

public class BaseClientEntity {
    protected String title;
    protected boolean active;

    public BaseClientEntity(String title) {
        this.title = title;
        this.active = true;
    }

    public void showInfo() { System.out.println("BaseClientEntity.showInfo(): " + title); }
    public void process() { System.out.println("BaseClientEntity.process(): " + title); }
    void internalCheck() { System.out.println("BaseClientEntity.internalCheck(): " + title); }

    public String toString() { return "BaseClientEntity{title='" + title + "', active=" + active + "}"; }
}
