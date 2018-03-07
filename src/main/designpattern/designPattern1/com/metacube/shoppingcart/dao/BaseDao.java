package main.designpattern.designPattern1.com.metacube.shoppingcart.dao;
import java.util.List;

import main.designpattern.designPattern1.com.metacube.shoppingcart.entity.Product;
/**
 *interface name-BaseDao
 *
 *@version 1.0
 *author - Manasi Pandya
 */
public interface BaseDao {
	public List<Product> getAll();
	public void addProduct(Product product);
	public void removeProduct(int productId);
	public void updateProduct(int productId, String productName, double price);
}