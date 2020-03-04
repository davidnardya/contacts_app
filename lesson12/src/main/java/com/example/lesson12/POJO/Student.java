package com.example.lesson12.POJO;

public class Student extends Person {
    String course;
    double average;

    public Student(String course, double average) {
        super("Student name");
        this.phone = "Some phone number";
        this.course = course;
        this.average = average;
    }

    @Override
    String getType() {
        return "STUDENT";
    }
}
