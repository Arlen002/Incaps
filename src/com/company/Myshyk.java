package com.company;

public class Myshyk {
    private String name;
    private String tusu;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTusu() {
        return tusu;
    }

    public void setTusu(String tusu) {
        this.tusu = tusu;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void methodGet(){
        System.out.println("Аты: "+getName()+", жашы "+
        getAge()+", тусу "+
        getTusu());
    }

}
