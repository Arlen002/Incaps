package com.company;

public class Laptop {
    private String name;
    private int jyly;
    private int pamyat;
    private String colour;
    private double prosessor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJyly() {
        return jyly;
    }

    public void setJyly(int jyly) {
        this.jyly = jyly;
    }

    public int getPamyat() {
        return pamyat;
    }

    public void setPamyat(int pamyat) {
        this.pamyat = pamyat;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getProsessor() {
        return prosessor;
    }

    public void setProsessor(double prosessor) {
        this.prosessor = prosessor;
    }
    void  sublaptops(){
        System.out.println(" "+ getName()+" "
        + getJyly()+" "
        + getPamyat()+" "
         + getColour()+" "
        + getProsessor());
    }
}
