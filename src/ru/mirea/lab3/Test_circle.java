package ru.mirea.lab3;

public class Test_circle {
    public static void main(String[] args){
        Circle Circle1 = new Circle();
        Circle Circle2 = new Circle(3, "red", true);
        Circle1.setRadius(5);
        System.out.println(Circle1.getArea());
        System.out.println(Circle2.getPerimeter());
        System.out.println(Circle1);
        System.out.println(Circle2);
    }
}
