package com.example.lesson12;

public class Friend extends Person {

    public Friend() {
        this.name = "Friend name";
        this.phone = "Friend number";
    }

    @Override
    String getType() {
        return "FRIEND";
    }
}
