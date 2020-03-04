package com.example.lesson12.POJO;

public class Friend extends Person {

    public Friend() {
        super("Friend name");
        this.phone = "Friend number";
    }

    @Override
    String getType() {
        return "FRIEND";
    }
}
