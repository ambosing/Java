package collection.list.test.ex4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void displayItems() {
		int sum = 0;
		for (Item item : items) {
			System.out.println(item);
			sum = item.getPrice() * item.getQuantity();
		}
		System.out.println("전체 가격 합 : " + sum);
	}
}
