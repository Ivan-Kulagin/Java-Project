package rtu.mirea.lab3;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int)(pow(radius, 2) * PI);
    }

    @Override
    public double getPerimeter() {
        return (int)(radius * 2 * PI);
    }

    @Override
    public String toString() {
        return "Circle, Radius = " + this.radius;
    }
}
