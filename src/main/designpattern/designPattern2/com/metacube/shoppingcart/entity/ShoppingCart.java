package main.designpattern.designPattern2.com.metacube.shoppingcart.entity;
import java.util.HashMap;
import java.util.Map;


/**
 * this class sets or gets the shopping cart entities
 * @author Manasi Pandya
 *
 */
public class ShoppingCart {

	private String userId;
	private Map<Product, Integer> items;
	float totalPrice;
	
	public ShoppingCart() {
		items = new HashMap<>();
	}
	/* Getters and Setters for all data members */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Map<Product, Integer> getItems() {
		return items;
	}
	public void setItems(Map<Product, Integer> items) {
		this.items = items;
	}
	public float getTotPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totPrice) {
		this.totalPrice = totPrice;
	}
	
}
