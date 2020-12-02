package ru.mirea.lab5;

public class task2 {

    static void printNumbers(int i, int n) {
        System.out.print(i + " ");
        if (i < n) {
            i = i + 1;
            printNumbers(i, n);
        }
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 150;
        printNumbers(min, max);
    }
}