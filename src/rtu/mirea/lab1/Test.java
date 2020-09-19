package rtu.mirea.lab1;

public class Test {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Chappy", 2);

        Book b1 = new Book();
        Book b2 = new Book("Green Mile", "Steven King", 100);
        Book b3 = new Book("A Storm of Swords", 10);

        Ball bl1 = new Ball();
        Ball bl2 = new Ball("Resin", "Red", 50);
        Ball bl3 = new Ball("Resin");

        d1.intoHumanAge();
        d1.setAge(5);
        d1.intoHumanAge();

        d2.setName("Bobik2");
        d2.intoHumanAge();


        b1.outputInfo();
        b1.setAuthor("Pushkin");
        System.out.println("Author changed: "+b1.getName());

        b2.outputInfo();
        b2.setCost(55);
        b2.outputInfo();

        b3.outputInfo();
        b3.setName("Adventures");
        b3.outputInfo();

        bl1.outputInfo();
        bl1.setMaterial("Quartz");
        bl1.setColor("Light Blue");
        bl1.setCost(300);
        bl1.outputInfo();

        bl2.outputInfo();
        bl3.outputInfo();
    }
}
