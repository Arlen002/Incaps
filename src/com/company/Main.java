package com.company;

public class Main {

    public static void main(String[] args) {
         Laptop laptop = new Laptop();
         laptop.setName("Apple ");
         laptop.setPamyat(512);
         laptop.setColour(" белый ");
         laptop.setRAM(16);

         Laptop laptop2 = new Laptop();
         laptop2.setName(" Lenovo ");
         laptop2.setPamyat(512);
         laptop2.setColour(" Серый ");
         laptop2.setRAM(16);
         Laptop [] laptops = {laptop,laptop2};

         Student st = new Student();
         st.setName(" Arlen  ");
         st.setAge(20);
         st.setGroup(" Java 5 ");
         st.setLaptops(laptops);
         st.gitLaptops();
        // st.study();


    }
}
