package ru.mirea.lab16;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumber {
	Item d = new Drink("Апельсиновый сок со льдом", "прохладительный напиток", 150);
	Item vine = new Drink("Вино", "алкогольный напиток", 400);
	Item karbonara = new Dish("Карбонара", "паста", 500);
	Item toast = new Dish("Гренки", "чесночные", 150);
	Item karbonara2 = new Dish("Карбонара", "фирменная паста", 500);

	InternetOrder i = new InternetOrder(new Item[]{vine,karbonara,toast,karbonara2});
	System.out.println(i.getNodeByIndex(1).value);
	System.out.println(i.itemQuantity());
	i.add(d);
	System.out.println((Arrays.toString(i.names_without_equals())));
	System.out.println(i.removeAll("Карбонара"));
	System.out.println(Arrays.toString(i.itemsNames()));
	System.out.println(i.costTotal());
	System.out.println(Arrays.toString(i.sort_by_price()));

	System.out.println("---------");

	RestaurantOrder a = new RestaurantOrder();
	a.add(toast);
	a.add(karbonara);
	a.add(vine);
	for(Item it: a.sort_by_price())
		System.out.print(it.getName() + " " + it.getCost()+"; ");
	System.out.println("\n" + a.costTotal());
	for(Item it: a.getItems())
		System.out.print(it.getName() + ", " + it.getCost()+ "; ");
	System.out.println("\n" + Arrays.toString(a.itemsNames()));
	a.removeAll("Карбонара");
	System.out.println(a.itemQuantity());
	System.out.println(a.itemQuantity("Вино"));
	RestaurantOrder b = new RestaurantOrder();
	b.add(d);
	b.add(karbonara2);
	System.out.println("---------");

	OrderManager ordm = new OrderManager();
	ordm.add(a, 1);
	ordm.add(b, 2);
	System.out.println(Arrays.toString(ordm.freeTableNumbers()));
	System.out.println(ordm.dishQuantity("Гренки"));
	System.out.println(Arrays.toString(ordm.getOrder(1).itemsNames()));
	System.out.println(ordm.orderCostSummary());
	for(RestaurantOrder ord: ordm.getOrders()){
		System.out.println(Arrays.toString(ord.itemsNames()));
	}
	ordm.removeOrder(1);
	System.out.println(ordm.orderCostSummary());
	ordm.addDish(karbonara, 2);
	System.out.println(ordm.orderCostSummary());

	System.out.println("---------");

	InternetOrder i1 = new InternetOrder(new Item[]{vine,karbonara,toast,karbonara2});
	InternetOrder i2 = new InternetOrder(new Item[]{d,karbonara});
	ordm.add("ул Ленина 81", i1);
	ordm.add("ул Ленина 201", i2);
	System.out.println(Arrays.toString(ordm.getOrder("ул Ленина 81").itemsNames()));
	ordm.removeOrder("ул Ленина 201");
	ordm.addDish("ул Ленина 81", d);
	for(InternetOrder ord: ordm.get_int_ord())
		System.out.println(Arrays.toString(ord.sort_by_price()));
	System.out.println(ordm.int_ord_sum());
	System.out.println(ordm.func("Вино"));
    }
}
