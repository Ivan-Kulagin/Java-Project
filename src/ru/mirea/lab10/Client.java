package ru.mirea.lab10;

public class Client {

    public Chair chair;

    Client(Chair chair){
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Присел на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Клиент, стул - " + chair;
    }
}