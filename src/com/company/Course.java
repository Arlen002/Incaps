package com.company;

public class Course {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 3000){
            System.out.println("");
        }
        this.price = price;
    }
}
