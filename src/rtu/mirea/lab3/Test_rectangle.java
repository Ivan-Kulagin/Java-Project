package rtu.mirea.lab3;

public class Test_rectangle {
    public static void main(String[] args){
        Rectangle Rectangle1 = new Rectangle();
        Rectangle Rectangle2 = new Rectangle(5, 10, "blue", true);
        Rectangle1.setLength(2);
        Rectangle1.setWidth(4);
        System.out.println(Rectangle1.getArea());
        System.out.println(Rectangle2.getPerimeter());
        System.out.println(Rectangle1);
        System.out.println(Rectangle2);
    }
}
