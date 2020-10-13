package com.company;

abstract class People  {
    String name;
    int age;
    boolean isMale;
    People (String name, int age, boolean isMale){
        this.name =name;
        this.age =age;
        this.isMale=isMale;
    }
    abstract String salutation();

}
