package org.springDIObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanDIObject.xml");
        Student stu =  context.getBean("pravallika", Student.class);
        stu.getStudentDetails();
    }
}
