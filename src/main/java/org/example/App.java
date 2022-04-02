package org.example;

import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Date;

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
//
//        InterfaceA iA = applicationContext.getBean("classA", InterfaceA.class);
//        System.out.println(iA.methodA());
        Exam exam=applicationContext.getBean("Mid",Exam.class);
        System.out.println(exam.methodExam());
//        LocalDate localDate=LocalDate.now();
//        String date=localDate.toString();
//        System.out.println(date);
        Exam f=applicationContext.getBean("Final",Exam.class);
        System.out.println(f.methodExam());
    }
}
