package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<People> uniPeople= new ArrayList<>();
        Student bob = new Student("bob",19,true,3);
        Student alice = new Student("Alice",19,false,3);
        Staff teacherAssitant = new Staff("bob",19,true);
        uniPeople.add(bob);
        uniPeople.add(alice);
        uniPeople.add(teacherAssitant);

        for (People element:uniPeople){
            System.out.println(element.salutation() + " "+element.name);
        }

    }
}
