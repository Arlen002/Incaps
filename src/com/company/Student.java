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
        if(!name.matches("[a-z][A-Z]*z")) {
            this.name = name;
        }else{
            System.out.println("soz jaxynyz");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public Laptop[] getLaptop() {
        return laptops;
    }
    public void setLaptop(Laptop[] laptop) {
        this.laptops = laptop;
    }
    void massiv(){
        System.out.println(getName()+" "+
       getAge()+" "+
        getGroup());

        for (Laptop str:getLaptop()) {
            str.sublaptops();
        }
    }

}
