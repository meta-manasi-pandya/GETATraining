package main.designpattern.designPattern2.com.metacube.shoppingcart.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.BaseDao;
import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.User;
/**
 * In memory storage type DAO to perform operations on Users
 * 
 * @author Manasi Pandya  
 *
 */
public class InMemoryUserDao implements BaseDao {
	public Map<Integer, User> mapOfAllUsers;
	public InMemoryUserDao() {
		mapOfAllUsers = new HashMap<>();
	}
	/**
	 * returns the list of all users
	 * 
	 */
	public List<User> getAll() {
		List<User> listOfUsers = new ArrayList<User>(mapOfAllUsers.values());
		return listOfUsers;
	}
	/**
	 * returns the set of all users
	 * 
	 */
	public Set<Integer> getUserIds(){
		Set<Integer> setOfUserId = mapOfAllUsers.keySet();
		return setOfUserId;
	}
	/**
	 * This method add the user in the list
	 * @param product - user object
	 */
	@Override
	public void addEntity(Object user) {
		this.mapOfAllUsers.put(((User)user).getId(), (User)user);
	}
	
	/**
	 * This method removes the user using user id
	 * @param productId - id of user
	 */
	@Override
	public void removeEntity(int userId) {
		mapOfAllUsers.remove(userId);
	}

	/**
	 * this method updates the user
	 */
	@Override
	public void updateEntity(int userId, Object...members ) {
		User user = mapOfAllUsers.get(userId);
		user.setUserName(members[0].toString());
		user.setPassword(members[1].toString());
	}
}
