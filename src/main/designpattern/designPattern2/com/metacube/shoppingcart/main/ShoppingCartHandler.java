package main.designpattern.designPattern2.com.metacube.shoppingcart.main;

import main.designpattern.designPattern2.com.metacube.shoppingcart.view.Input;
/**
 * 
 * @author Manasi Pandya
 * This class is used to handle entire system
 */
public class ShoppingCartHandler {
	public static void main(String args[]){
		Input menu = new Input();
		menu.takeInput();
	}
}
