package org.example;

public class VendRunner {

	public static void main(String[] args) {

		// Snacks, Beverages, slot
		Snack snack1 = new Snack("Snickers", 2.00, true);
		Snack snack2 = new Snack("Potato Chips", 1.75, true);
		Snack snack3 = new Snack("Beef Jerky", 2.50, false);

//		Product prodEr1 = new Snack("", 3.50, false);
//		Product prodEr2 = new Snack(null, 2.50, true);
//		Product prodEr3 = new Snack("Twizzlers", -1.50, true);

//		Product bevErr1 = new Beverage("Celsius", 2.50, -1.5);

		Beverage b1 = new Beverage("Red Bull", 3.50, 4.5);
		Beverage b2 = new Beverage("Pepsi", 2.00, 3.0);
		Beverage b3 = new Beverage("Gatorade", 2.50, 4.0);

//		b1.setFlOunces(-5.5);

//		Slot<Snack> slotEr1 = new Slot<>(snack1, -4);
//		Slot<Beverage> slotEr2 = new Slot<>(null, 6);

		Slot<Snack> slot1 = new Slot<>(snack2, 4);

		VendingMachine vendErr1 = new VendingMachine();

//		vendErr1.addProduct(null, slot1);
//		vendErr1.addProduct("", slot1);
//		vendErr1.addProduct("D3", null);

//		vendErr1.dispenseProduct(null);
//		vendErr1.dispenseProduct("");

	}
}
