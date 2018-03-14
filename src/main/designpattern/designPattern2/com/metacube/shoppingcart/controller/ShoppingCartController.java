package main.designpattern.designPattern2.com.metacube.shoppingcart.controller;

import java.util.Map;

import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.Product;
import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.ShoppingCart;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.OperationStatus;
import main.designpattern.designPattern2.com.metacube.shoppingcart.facade.ShoppingFacade;

public class ShoppingCartController {

	private ShoppingFacade shoppingFacade;
	
	public ShoppingCartController() {
		shoppingFacade = ShoppingFacade.getInstance();
	}
	
	public Map<Product, Integer> newCart(String uid, ShoppingCart cart) {
		return shoppingFacade.addCart(uid, cart);
	}
	
	public boolean checkUser(String name) {
		return shoppingFacade.checkUser(name);
	}
	
	public Map<Product, Integer> getList (String Uid) {
		return shoppingFacade.getList(Uid);
	}
	
	public OperationStatus addToCart(String Uid, int productId, int quantity) {
		return shoppingFacade.addToCart(Uid,productId,quantity );
	}
	
	public OperationStatus removeFromCart(String Uid, int productId) {
		return shoppingFacade.removeFromCart(Uid,productId);
	}
	public OperationStatus removeCart(String Uid) {
		return shoppingFacade.removeCart(Uid);
	}
	public float getTotPrice(String Uid) {
		return shoppingFacade.getTotalPrice(Uid);
	}
}
