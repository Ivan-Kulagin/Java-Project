package rtu.mirea.lab5;

public class task6 {

    public static boolean prime(int a, int d){
        if (d > a / 2){
            return true;
        } else {
            if (a % d == 0){
                return false;
            } else {
                return prime(a, d + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(prime(17, 2));
        System.out.println(prime(300, 2));
    }
}
