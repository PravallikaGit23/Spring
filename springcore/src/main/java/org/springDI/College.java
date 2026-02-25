package org.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //property - setter injectiom -> requires no arg defacult constructor
        Student st = context.getBean("pravallika",Student.class);
        st.getStudentDetails();

        //constructor-arg - constructor injection
        Student st1 = context.getBean("sai",Student.class);
        st1.getStudentDetails();
        st1.setId(23);
        st1.setName("hetvik");
        st1.getStudentDetails();



    }
}
