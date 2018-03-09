package main.designpattern.designPattern2.com.metacube.shoppingcart.controller;

import java.util.List;

import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.Product;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.OperationStatus;
import main.designpattern.designPattern2.com.metacube.shoppingcart.facade.ProductFacade;

public class ProductController {
	private ProductFacade productFacade;
	
	public ProductController() {
		productFacade = ProductFacade.getInstance();
	}
	public OperationStatus add(Product product) {
		return productFacade.addProduct(product);
	}
	
	public OperationStatus remove(int id) {
		return productFacade.removeProduct(id);
	}
	
	public OperationStatus update(int id, String name, double price) {
		return productFacade.updateProduct(id, name, price);
	}
	
	public List<Product> getAllProducts() {
		return (List<Product>) productFacade.getAllProducts();
	}
}
