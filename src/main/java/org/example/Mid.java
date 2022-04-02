package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("Mid")
public class Mid implements Exam {

    @Value("${mid.date}")
    private String localDate;

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String methodExam() {

        return "Mid is going on "+localDate;
    }
}
