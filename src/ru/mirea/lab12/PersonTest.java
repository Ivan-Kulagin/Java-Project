package ru.mirea.lab12;

public class PersonTest {

    public  static void main(String[] args){

        Person person = new Person("Кулагин Иван Антонович");
        System.out.println(person.getFio());
        person.setFio("Бартенев Борис Константинович");
        System.out.println(person.getFio());
    }
}
