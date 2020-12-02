package ru.mirea.lab1;

import java.lang.*;
public class Dog {
        private String name;
        private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog() {
        name = "Bobik";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toStr() {
        return "Dog: "+this.name+", age "+this.age; }
        public void outputInfo() {System.out.println(toStr());}
    public void intoHumanAge() {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
    }