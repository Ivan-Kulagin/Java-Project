package rtu.mirea.lab1;

public class Ball {
    private String material;
    private String color;
    private int cost;

    public Ball(String m, String col, int c) {
        material = m;
        color = col;
        cost = c;
    }

    public Ball(String m) {
        material = m;
        color = "unknown";
        cost = 0;
    }

    public Ball() {
        material = "unknown";
        color = "unknown";
        cost = 0;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public String toStr() {
        return "Ball: "+this.material+", "+this.color+", "+this.cost;
    }

    public void outputInfo() {
        System.out.println(toStr());
    }
}
