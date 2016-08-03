package net.aimeizi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppStart {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}