package main.designpattern.designPattern1.com.metacube.shoppingcart.entity;

/**
 * this class sets or gets the product entities like name, price etc
 * @author Manasi Pandya
 *
 */
public class Product extends BaseEntity {
	private String name;
	private double price;
	/**
	 * constructor for initiating the entities
	 * @param name - name of product
	 * @param price - price of product
	 */
	public Product(String name, double price){
		super();
		this.name = name;
		this.price = price;
	}
	
	/**
	 * gets the product price
	 * @return - price of product
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * sets the price of product
	 * @param price - product price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the product name
	 * @return - name of product
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * sets the name of product
	 * @param name - product name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
