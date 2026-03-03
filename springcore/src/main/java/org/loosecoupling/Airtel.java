package org.loosecoupling;

public class Airtel {
    private Service serviceObj;

    public Service getServiceObj() {
        return serviceObj;
    }

    public void setServiceObj(Service serviceObj) {
        this.serviceObj = serviceObj;
    }

    public void callService(){
        serviceObj.service();
    }
}
