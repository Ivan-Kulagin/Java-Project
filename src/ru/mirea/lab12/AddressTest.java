package ru.mirea.lab12;

public class AddressTest {

    public static void main(String[] args){

        Address address1 = new Address("Россия Москва Москва Тверская 13 А 12");
        System.out.println(address1.getAddress());
        Address address2 = new Address("Россия, Калужская область, Обнинск, Пушкина, Колотушкина, 123, 456", ",");
        System.out.println(address2.getAddress());
        Address address3 = new Address("Российская Федерация.Московская область.Видное.Советская.1.Б.333", "\\.");
        System.out.println(address3.getAddress());
        Address address4 = new Address("СССР;Ленинградская область;Ленинград;Проспект Науки;25;1;1", ";");
        System.out.println(address4.getAddress());
    }
}
