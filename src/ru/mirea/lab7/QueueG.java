package ru.mirea.lab7;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class QueueG {

    public static class Queue{
        int n = 0;
        int a[] = new int[100];

        public void offer(int b){
            a[n] = b;
            n++;
        }

        public int poll(){
            int x = a[0];
            for (int i = 0; i < n - 1; i++){
                a[i] = a[i+1];
            }
            n--;
            return x;
        }

        public boolean empty(){
            if (n == 0)
                return true;
            else
                return false;
        }
    };

    public static void main(String[] args){

        int c1, c2;
        Queue d1 = new Queue();
        Queue d2 = new Queue();
        Stack<Integer> d = new Stack<>();
        for (int i = 0; i <= 9; i++){
            d.push(i);
        }
        Collections.shuffle(d);
        for (int i = 0; i <= 4; i++){
            d1.offer(d.pop());
            d2.offer(d.pop());
        }
        System.out.println("Start: ");
        for (int i = 0; i < d1.n; i++) {
            System.out.print(d1.a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < d2.n; i++) {
            System.out.print(d2.a[i] + " ");
        }
        System.out.println();
        System.out.println("Result: ");
        for (int i = 1; i <= 107; i++){
            if (i == 107){
                System.out.println("botva");
                break;
            }
            c1 = d1.poll();
            c2 = d2.poll();
            if (c1 == 0 && c2 == 9){
                d1.offer(c1);
                d1.offer(c2);
            }
            else if (c1 == 9 && c2 == 0) {
                d2.offer(c1);
                d2.offer(c2);
            }
            else if (c1 > c2){
                d1.offer(c1);
                d1.offer(c2);
            }
            else {
                d2.offer(c1);
                d2.offer(c2);
            }
            if (d1.empty()){
                System.out.println("second " + i);
                break;
            }
            if (d2.empty()){
                System.out.println("first " + i);
                break;
            }
        }
    }
}
