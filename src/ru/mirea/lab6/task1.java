package ru.mirea.lab6;

import java.util.Random;

public class task1 {

    static class Student{
        private int iDNumber;

        Student(int iDNumber) {
            this.iDNumber = iDNumber;
        }

        public int getiD(){
            return iDNumber;
        }

        public void setiD(int iDNumber){
            this.iDNumber = iDNumber;
        }
    }

    public static void main(String[] args) {

        int N = 30;
        Student[] student = new Student[N];
        Random random = new Random();

        for (int i = 0; i < N; i++){
            student[i] = new Student(random.nextInt(1000));
        }

        for (int i = 0; i < N; i++){
            System.out.print(student[i].getiD() + "  ");
        }

        for (int left = 0; left < N; left++) {
            int value = student[left].getiD();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < student[i].getiD()) {
                    student[i + 1].setiD(student[i].getiD());
                } else {
                    break;
                }
            }
            student[i + 1].setiD(value);
        }

        System.out.println();

        for (int i = 0; i < N; i++){
            System.out.print(student[i].iDNumber + "  ");
        }
    }
}
