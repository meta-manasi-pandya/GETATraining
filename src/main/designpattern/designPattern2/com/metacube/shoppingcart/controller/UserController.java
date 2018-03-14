package main.designpattern.designPattern2.com.metacube.shoppingcart.controller;

import java.util.List;

import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.User;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.OperationStatus;
import main.designpattern.designPattern2.com.metacube.shoppingcart.facade.UserFacade;

public class UserController<T> {
	private UserFacade userFacade;
	
	public UserController() {
		userFacade = UserFacade.getInstance();
	}
	public OperationStatus add(User user) {
		return userFacade.addUser(user);
	}
	
	public OperationStatus remove(int id) {
		return userFacade.removeUser(id);
	}
	public OperationStatus update(int id, String name, String password) {
		return userFacade.updateUser(id, name, password);
	}
	 
	public List<User> getAllUsers() {
		return (List<User>) userFacade.getAllUsers();
	}
}
