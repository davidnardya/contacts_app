package com.example.lesson12;

public class Family extends Person {

    public Family() {
        this.name = "Family name";
        this.phone = "Family number";
    }


    @Override
    String getType() {
        return "FAMILY";
    }
}
