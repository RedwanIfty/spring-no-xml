package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB implements InterfaceA {

    private ClassA cA1;

    /*public ClassB() {
    }*/

    @Autowired
    public ClassB(ClassA cA1) {
        this.cA1 = cA1;
        /*System.out.println(cA1.methodA());*/
    }

    @Override
    public String methodA() {
        return "I am from ClassB:methodA";
    }

    public ClassA getcA1() {
        return cA1;
    }

    public void setcA1(ClassA cA1) {
        this.cA1 = cA1;
    }
}
