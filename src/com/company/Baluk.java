package com.company;

public class Baluk {
    private String name;
    private int length;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    void methodGet(){
        System.out.println("Балык туру: "+getName()+", узундугу "+
        getLength()+", салмагы "+
        getWeight());

    }
}
