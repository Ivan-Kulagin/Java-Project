package ru.mirea.lab10;

public class FunctionalChair implements Chair{

    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public String toString() {
        return "Функциональный стул";
    }
}
