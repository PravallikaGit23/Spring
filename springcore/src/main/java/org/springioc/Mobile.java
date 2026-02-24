package org.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();
//
//        //runtime polymorphism
//        Sim sim = new Vodafone();
//        sim.calling();
//        sim.data();
//
//        // This is a container object - read the config file and create beans.
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        //getBean returns an Object so we need to cast to the required Object
//        Airtel airtelsim = (Airtel) context.getBean("airtel");
//        airtelsim.calling();
//        airtelsim.data();
//        //System.out.println("airtel bean called.");

        Sim simContext = context.getBean("sim",Sim.class);
        simContext.calling();
        simContext.data();


    }
}
