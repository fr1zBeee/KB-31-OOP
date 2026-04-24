package bank.core;

public class BaseClientEntity {
    protected String title;
    protected boolean active;
    protected static int objectCount = 0;

    public BaseClientEntity(String title) {
        this.title = title;
        this.active = true;
        objectCount++;
    }

    public void showInfo() { System.out.println("BaseClientEntity.showInfo(): " + title); }
    public static void printClassInfo() { System.out.println("BaseClientEntity.printClassInfo(): base class for client entities"); }
    public static int getObjectCount() { return objectCount; }
}
