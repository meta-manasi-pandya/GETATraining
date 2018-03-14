package main.designpattern.designPattern2.com.metacube.shoppingcart.dao;

import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.impl.InMemoryProductDao;
import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.impl.InMemoryShoppingCartDao;
import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.impl.InMemoryUserDao;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.Database;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.EntityType;
/**
 * This class is used to return storage instance type 
 * like in-memory or database type
 * @author Manasi Pandya
 *
 */

public class Factory {
	
	private static BaseDao obj;
	public static BaseDao getInstance(EntityType entityType, Database dbName) {
		if(dbName == Database.IN_MEMORY){
			switch(entityType) {
				case PRODUCT : obj = new InMemoryProductDao();
							return obj;
				case USER : obj = new InMemoryUserDao();
							return obj;
				case SHOPPING_CART : obj = new InMemoryShoppingCartDao();
							return obj;
			}
		}
	return null;	
	}
	private Factory() {}
}
