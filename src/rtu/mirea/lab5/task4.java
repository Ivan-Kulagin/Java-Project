package rtu.mirea.lab5;
import static java.lang.Math.pow;

public class task4 {

    static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }

    public static void main(String[] args) {
        int k = 2;
        int s = 6;
        int a = 0;
        for (int i = (int) pow(10, k - 1); i < (int) pow(10, k); i++) {
            if (sum(i) == s)
                a++;
        }
        System.out.println(a);
    }
}