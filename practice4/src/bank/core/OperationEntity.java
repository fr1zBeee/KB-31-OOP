package bank.core;

public class OperationEntity {
    protected String code;
    protected String status;

    public OperationEntity(String code) {
        this.code = code;
        this.status = "Created";
    }

    public void showInfo() { System.out.println("OperationEntity.showInfo(): " + code + ", status=" + status); }
    public void process() { System.out.println("OperationEntity.process(): " + code); }
    void internalCheck() { System.out.println("OperationEntity.internalCheck(): " + code); }

    public String toString() { return "OperationEntity{code='" + code + "', status='" + status + "'}"; }
}
