package org.springioc;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling using Vodafone sim");
    }

    @Override
    public void data() {
        System.out.println("data using Vodafone sim");
    }
}
