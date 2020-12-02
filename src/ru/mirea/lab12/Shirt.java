package ru.mirea.lab12;

public class Shirt {

    private String shirt[];

    Shirt(String shirt){
        this.shirt = shirt.split(",");
    }

    @Override
    public String toString(){
        return "Артикул: " + shirt[0] +
                "\nНаименование: " + shirt[1] +
                "\nЦвет: " + shirt[2] +
                "\nРазмер: " + shirt[3];
    }
}
