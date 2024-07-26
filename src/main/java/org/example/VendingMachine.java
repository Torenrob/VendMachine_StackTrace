package org.example;

import java.util.Map;
import java.util.TreeMap;

public class VendingMachine {
	private Map<String,Slot<? extends Product>> slots;//<?extends Products>

	//default constructor
	public VendingMachine() {
		this.slots = new TreeMap<>();
	}

	public Map<String, Slot<? extends Product>> getSlots() {
		return this.slots;
	}

	public void addProduct(String code, Slot<? extends Product> slot) {
		if(code == null || code.isEmpty()) {
			throw new IllegalArgumentException("Product cannot be null or empty");
		}
		if(slot == null) {
			throw new IllegalArgumentException("Slot cannot be null");
		}else {
			slots.put(code, slot);
		}
	}

	public void dispenseProduct(String code) {
     if(code == null || code.isEmpty()){
		 throw new IllegalArgumentException("Product cannot be null or empty");
	 }else {
		 if (slots.containsKey(code)) {
			 if (this.slots.get(code).getQuantity() > 0) {
				 Slot<? extends Product> slot = this.slots.get(code);
				 slot.setQuantity(this.slots.get(code).getQuantity() - 1);
				 System.out.println(slot.getProduct().getName());
			 } else {
				 System.out.println("Product Not Available");
			 }
		 } else {
			 System.out.println("Invalid Input");
		 }
	 }
	}

	// "F2"
	// if(input == "F2"

	public void displayProducts() {
		//display all available products
		for(Map.Entry<String, Slot<? extends Product>> slot : this.slots.entrySet()) System.out.println(slot);
		//Slot{product=Snack{SnickersPrice= 2.0isVegan=true}, quantity=3}
		// what we WANT
		//F1 {product=Snack{SnickersPrice= 2.0isVegan=true}, quantity=3}
	}

	@Override
	public String toString() {
		return "VendingMachine{" +
			"slots=" + slots +
			'}';
	}
}
