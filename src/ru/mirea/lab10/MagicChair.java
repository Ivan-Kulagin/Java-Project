package ru.mirea.lab10;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("А где тут магия?");
    }

    @Override
    public String toString() {
        return "Магический стул";
    }
}