package bank.core;

public class InternalService {
    public void inspectAll(BaseClientEntity client, FinancialEntity financial, OperationEntity operation) {
        System.out.println("InternalService.inspectAll()");
        client.internalCheck();
        financial.internalCheck();
        operation.internalCheck();
    }
}
