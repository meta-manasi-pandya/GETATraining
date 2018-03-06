package main.designpattern.designPattern1.com.metacube.shoppingcart.facade;

import main.designpattern.designPattern1.com.metacube.shoppingcart.facade.ShoppingFacade;

/**
 * This class performs operation related to Shopping cart like total etc.
 * @author Manasi Pandya
 *
 */

public class ShoppingFacade {
	private static ShoppingFacade shoppingFacadeInstance;
	
	private ShoppingFacade(){};
	
	public static ShoppingFacade getInstance(){
		if(shoppingFacadeInstance == null){
			shoppingFacadeInstance = new ShoppingFacade();
		}
		return shoppingFacadeInstance;
	}
	
	
}