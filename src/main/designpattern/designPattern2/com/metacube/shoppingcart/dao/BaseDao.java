package main.designpattern.designPattern2.com.metacube.shoppingcart.dao;

import java.util.List;
/**
 *interface name-BaseDao
 *
 *@version 1.0
 *author Manasi Pandya
 */
public interface BaseDao<T> {
	public List<T> getAll();
	public void addEntity(T entity);
	public void removeEntity(int id);
	public void updateEntity(int id, T... members);
}
