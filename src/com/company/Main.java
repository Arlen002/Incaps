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

