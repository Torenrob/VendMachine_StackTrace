package org.example;

public class Product {
	//public or private?
	private String name;
	private double price;

	public Product(String name, double price) throws IllegalArgumentException {
		if (name == null || name.isEmpty() || price < 0) {
			throw new IllegalArgumentException("Name cannot be empty/null. price needs to be non negative");
		}
		else {
			this.name = name;
			this.price = price;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws IllegalArgumentException{
		if (name == null || name.isEmpty()){
			throw new IllegalArgumentException("Name cannot be empty/null");
		} else {
			this.name = name;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws IllegalArgumentException {
		if (price < 0){
			throw new IllegalArgumentException("price cannot be negative");
		} else {
			this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Product{" +
			"name='" + name + '\'' +
			", price=" + price +
			'}';
	}
}
