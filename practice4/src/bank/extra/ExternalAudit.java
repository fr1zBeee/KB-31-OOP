package bank.extra;

import bank.core.BaseClientEntity;

public class ExternalAudit {
    public void audit(BaseClientEntity client) {
        System.out.println("ExternalAudit.audit()");
        client.showInfo();
        System.out.println("Package-private method internalCheck() is not accessible here.");
    }
}
