package com.company;

public class Main {

    public static void main(String[] args) {
         Laptop laptop = new Laptop();
         laptop.setName("Lenovo ");
         laptop.setJyly(2019);
         laptop.setPamyat(256);
         laptop.setColour(" Serebristyi ");
         laptop.setProsessor(8);
         laptop.sublaptops();


        Laptop laptop2 = new Laptop();
        laptop2.setName("Аpple ");
        laptop2.setJyly(2020);
        laptop2.setPamyat(512);
        laptop2.setColour(" kok ");
        laptop2.setProsessor(16);
        Laptop [] laptops = {laptop, laptop2};


        Student st = new Student();
        st.setName(" Arlen ");
        st.setAge(-20);
        st.setGroup(" Java 5 ");
        st.setLaptop(laptops);
        st.massiv();
    }
}
