package main.designpattern.designPattern1.com.metacube.shoppingcart.dao;

/**
 * This class is used to return storage instance type 
 * like in-memory or database type
 * @author Manasi Pandya
 *
 */
public class ProductFactory{
	
	private static BaseDao baseDao;
	public static BaseDao getInstance(DatabaseEnum dbName) {
		switch(dbName){
		case IN_MEMORY : baseDao = new InMemoryProductDao();
						return baseDao;
		case SQL : return null;
		}
	return null;	
	}
	private ProductFactory() {}
}
