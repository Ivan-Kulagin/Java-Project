package rtu.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(41.53, 28.15);
        System.out.println(b1);
        b1.move(10, 100);
        System.out.println(b1);
    }
}