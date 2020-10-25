package rtu.mirea.lab5;

public class task5 {

    static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }

    public static void main(String[] args){
        int N = 1571;
        System.out.println(sum(N));
    }
}
