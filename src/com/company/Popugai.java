package com.company;

public class Popugai {
    private String name;
    private int age;
    private String colour;
    private int weight;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    void methodGet(){
        System.out.println("Попушай туру: "+getName()+", жашы "+getAge()+ ", тусу "+getColour()+ ", салмагы "+getWeight());

    }
}
