package ru.mirea.lab7;

import java.util.Collections;
import java.util.Stack;

public class StackG {
    public static void main(String[] args){

        Integer c1, c2;
        Stack<Integer> d1 = new Stack<>();
        Stack<Integer> d2 = new Stack<>();
        Stack<Integer> d = new Stack<>();
        for (int i = 0; i <= 9; i++){
            d.push(i);
        }
        Collections.shuffle(d);
        for (int i = 0; i <= 4; i++){
            d1.push(d.pop());
            d2.push(d.pop());
        }
        System.out.println("Start: ");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Result: ");
        for (int i = 1; i <= 107; i++){
            if (i == 107){
                System.out.println("botva");
                break;
            }
            c1 = d1.pop();
            c2 = d2.pop();
            if (c1 == 0 && c2 == 9){
                while(!d1.empty()){
                    d.push(d1.pop());
                }
                d1.push(c2);
                d1.push(c1);
                while(!d.empty()){
                    d1.push(d.pop());
                }
            }
            else if (c1 == 9 && c2 == 0) {
                while(!d2.empty()){
                    d.push(d2.pop());
                }
                d2.push(c2);
                d2.push(c1);
                while(!d.empty()){
                    d2.push(d.pop());
                }
            }
            else if (c1 > c2){
                while(!d1.empty()){
                    d.push(d1.pop());
                }
                d1.push(c2);
                d1.push(c1);
                while(!d.empty()){
                    d1.push(d.pop());
                }
            }
            else {
                while(!d2.empty()){
                    d.push(d2.pop());
                }
                d2.push(c2);
                d2.push(c1);
                while(!d.empty()){
                    d2.push(d.pop());
                }
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