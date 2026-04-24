package bank.core;

public class OperationEntity {
    protected String code;
    protected String status;
    protected static int objectCount = 0;

    public OperationEntity(String code) {
        this.code = code;
        this.status = "Created";
        objectCount++;
    }

    public void showInfo() { System.out.println("OperationEntity.showInfo(): " + code); }
    public static void printClassInfo() { System.out.println("OperationEntity.printClassInfo(): base class for operation entities"); }
    public static int getObjectCount() { return objectCount; }
}
