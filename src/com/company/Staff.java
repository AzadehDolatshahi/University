package com.company;

public class Staff extends People{

    Staff(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    @Override
    String salutation() {
        return "Prof.";
    }
}
