package com.company;

public class Dog {
    private String name;
    private int age;
    private String colour;
    private  String paroda;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }
    void methodGet(){
        System.out.println( "Aты: "+getName()+", жашы "+
        getAge()+", тусу "+
        getColour()+", пародасы "+
       getParoda());
    }
}
