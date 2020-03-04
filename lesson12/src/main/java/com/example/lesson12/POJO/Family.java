package com.example.lesson12.POJO;

public class Family extends Person {

    public Family() {
        super("Family name");
        this.phone = "Family number";
    }


    @Override
    String getType() {
        return "FAMILY";
    }
}
