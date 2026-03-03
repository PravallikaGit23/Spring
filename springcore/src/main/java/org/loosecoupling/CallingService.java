package org.loosecoupling;

public class CallingService implements Service{
    @Override
    public void service() {
        System.out.println(" calling service called");
    }
}
