package com.company;

public class Main {

    public static void main(String[] args) {
         Baluk baluk = new Baluk();
         baluk.setName("Bersh");
         baluk.setLength(40);
         baluk.setWeight(1.4);
         baluk.methodGet();

         Myshyk myshyk = new Myshyk();
         myshyk.setName("Tom");
         myshyk.setAge(3);
         myshyk.setTusu("kara-ala");
         myshyk.methodGet();

         Dog dog = new Dog();
         dog.setName("Reks");
         dog.setAge(20);
         dog.setColour("Kara");
         dog.setParoda("Apcherka");
         dog.methodGet();

         Popugai popugai = new Popugai();
         popugai.setName("Amazony");
         popugai.setAge(50);
         popugai.setColour("ak");
         popugai.setWeight(400);
         popugai.methodGet();



    }
    }
//         Laptop laptop = new Laptop();
//         laptop.setName("Lenovo ");
//         laptop.setJyly(2019);
//         laptop.setPamyat(256);
//         laptop.setColour(" Serebristyi ");
//         laptop.setProsessor(8);
//         laptop.sublaptops();
//
//        Laptop laptop2 = new Laptop();
//        laptop2.setName("Аpple ");
//        laptop2.setJyly(2020);
//        laptop2.setPamyat(512);
//        laptop2.setColour(" kok ");
//        laptop2.setProsessor(16);
//        Laptop [] laptops = {laptop, laptop2};
//
//        Student st = new Student();
//        st.setName(" Arlen ");
//        st.setAge(-20);
//        st.setGroup(" Java 5 ");
//        st.setLaptop(laptops);
//        st.massiv();
//    }
//}
