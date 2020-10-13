package com.company;

public class Student extends  People {
    int semester;


    Student(String name, int age, boolean isMale, int semester) {
        super(name, age, isMale);
        this.semester=semester;
    }
    @Override
    String salutation (){
        if(isMale == true) {
            return "Mr.";
        }
        else {
            return "Ms.";
        }
    }

}
