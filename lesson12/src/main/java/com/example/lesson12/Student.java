package com.example.lesson12;

public class Student extends Person {
    String course;
    double average;

    public Student(String course, double average) {
        this.name = "Student name";
        this.phone = "Some phone number";
        this.course = course;
        this.average = average;
    }

    @Override
    String getType() {
        return "STUDENT";
    }
}
