package com.company;

public class Laptop {
    private String name;
    private int pamyat;
    private String colour;
    private int RAM;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    void latopsGet(){
        System.out.println(" Marka: "+getName()+", память "+getPamyat()+", тусу "+getColour()+", ОЗУ "+getRAM());
    }
}
