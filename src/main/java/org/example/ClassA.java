package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("classA")
public class ClassA implements InterfaceA {

    @Value("${my.user.email}")
    private String email;

    @Override
    public String methodA() {
        return email + ": I am from ClassA:methodA";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
