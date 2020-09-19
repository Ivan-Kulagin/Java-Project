package rtu.mirea.lab1;

public class Book {
    private String name;
    private String author;
    private int cost;

    public Book() {
        name = "unknown";
        author = "unknown";
        cost = 0;
    }
    public Book(String n, String a, int c) {
        name = n;
        author = a;
        cost = c;
    }

    public Book(String n, int c) {
        name = n;
        author = "unknown";
        cost = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCost () {
        return cost;
    }

    public String toStr() {
        return "Book: "+this.name+", Author: "+this.author+", Cost: "+this.cost;
    }
    public void outputInfo() {
        System.out.println(toStr());
    }
}
