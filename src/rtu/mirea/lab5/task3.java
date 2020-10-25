package rtu.mirea.lab5;

public class task3 {

    static void printNumbers(int i, int n) {
        if (i < n) {
            printNumbers(i, n-1);
            System.out.print(n + " ");
        }
        else if (i > n) {
            System.out.print(i + " ");
            printNumbers(i-1, n);
        }
        else
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int a = 51;
        int b = 12;
        printNumbers(a, b);

        System.out.println();

        a = 17;
        b = 56;
        printNumbers(a, b);
    }
}
