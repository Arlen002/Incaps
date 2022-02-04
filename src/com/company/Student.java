package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private Laptop [] laptops;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-z A-Z]*$")) {
            this.name = name;
        } else {
       System.out.println("Soz gana jazynyz");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("san jazynyz");
        } else {
            this.age = age;
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Laptop[] getLaptops() {
        return laptops;
    }

    public void setLaptops(Laptop[] laptops) {
        this.laptops = laptops;
    }
    void  gitLaptops(){
        System.out.println(" Студент: "+getName()+", жашы "+getAge()+", группасы "+getGroup());

        for (Laptop res:getLaptops()) {
            res.latopsGet();
        }
    }
//    String study(){
//        String uchit = getName()+ getGroup()+" группасында окуйт.";
//        return uchit;
//    }
//    String play(){
//        String oyin = getName() + " GTA 5 ти "+" менен ойнойт";
//        return oyin;
//    }
}
