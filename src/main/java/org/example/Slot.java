package org.example;

public class Slot <T extends Product> {
	private T product;
	private int quantity;

	public Slot() {	}

	public Slot(T product, int quantity) {
		if (product == null) {
			throw new IllegalArgumentException("Product cannot be null");
		}
		else {
			this.product = product;
		}
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be less than 0");
		}
		else {
			this.quantity = quantity;
		}
	}

	public T getProduct() {
		return product;
	}

	public void setProduct(T product) {
		if (product == null) {
			throw new IllegalArgumentException("Product cannot be null");
		}
		else {
			this.product = product;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be less than 0");
		}
		else {
			this.quantity = quantity;
		}
	}

	//fori loop, each iteration prints "Slot[i}
	@Override
	public String toString() {
		return "Slot{" +
			"product=" + product +
			", quantity=" + quantity +
			'}';
	}

}
