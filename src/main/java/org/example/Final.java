package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Final")
public class Final implements Exam{
    @Value("${final.date}")
    private String localDate;

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }
    public String methodExam(){
        return "Final is going on "+localDate;
    }
}
