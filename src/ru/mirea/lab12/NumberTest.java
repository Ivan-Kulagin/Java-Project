package ru.mirea.lab12;

public class NumberTest  {

    public static void main(String[] args){

        Number number1 = new Number("81234567890");
        System.out.println(number1.getNumber());
        Number number2 = new Number("+71234567890");
        System.out.println(number2.getNumber());
    }
}
