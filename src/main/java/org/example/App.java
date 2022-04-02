package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*InterfaceA cA = new ClassA();
        cA.methodA();*/

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        /*InterfaceA iA = applicationContext.getBean("classB", InterfaceA.class);
        System.out.println(iA.methodA());*/

        InterfaceA iA = applicationContext.getBean("classB", InterfaceA.class);
        System.out.println(iA.methodA());
    }
}
