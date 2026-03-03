package org.loosecoupling;

public class MessageService implements Service{
    @Override
    public void service() {
        System.out.println(" message service called");
    }
}
