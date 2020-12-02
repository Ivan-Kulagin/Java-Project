package ru.mirea.lab3;

public class Test_square {
    public static void main(String[] args){
        Square Square1 = new Square();
        Square Square2 = new Square("yellow", false, 5);
        Square1.setSide(10);
        System.out.println(Square1.getArea());
        System.out.println(Square2.getPerimeter());
        System.out.println(Square1);
        System.out.println(Square2);
    }
}
