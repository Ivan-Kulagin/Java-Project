package ru.mirea.lab12;

public class Person {

    private String fio;

    Person(String fio){
        this.fio = fio;
    }

    public void setFio(String fio){
        this.fio = fio;
    }

    public String getFio(){

        String substr[] = fio.split(" ");
        String s = substr[0];
        for (int i = 1; i < substr.length; i++){
            if (i == 1) {
                s += " ";
            }
            s += substr[i].substring(0, 1) + ".";
        }
        return  s;
    }
}
