package com.company;

public class Rectangle {
    private double a;
    private double b;



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    double area(){
        double p = a*b;
        return p;
    }
}
