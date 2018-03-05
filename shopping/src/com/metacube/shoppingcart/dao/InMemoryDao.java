package com.metacube.shoppingcart.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.metacube.shoppingcart.entity.Product;

public class InMemoryDao implements BaseDao {
	
	public Map<Integer , Product> product = null;
	product = new HashMap<>();

	public List<Product> getAll() {
		public List<Product> list = null;
		list = new ArrayList<>();
		for(Entry<Integer, Product> e: this.product.entrySet()){
			list.add((Product)e.getValue());
		}
		return list;
	}

	public void addProduct(Product product) {
		this.product.put(product.getId(), product);
		
	}
	
}
