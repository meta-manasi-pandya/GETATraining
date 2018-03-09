package main.designpattern.designPattern2.com.metacube.shoppingcart.facade;

import java.util.List;

import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.Factory;
import main.designpattern.designPattern2.com.metacube.shoppingcart.dao.impl.InMemoryUserDao;
import main.designpattern.designPattern2.com.metacube.shoppingcart.entity.User;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.Database;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.EntityType;
import main.designpattern.designPattern2.com.metacube.shoppingcart.enums.OperationStatus;
/**
 * All the business logic for the user resides here
 * (Singleton class)
 * 
 * @author Manasi Pandya
 *
 */
public class UserFacade {
	private static UserFacade userFacadeInstance;
	InMemoryUserDao inMemoryUserDao =(InMemoryUserDao) Factory.getInstance(EntityType.USER, Database.IN_MEMORY);	//Singleton object creation
	public static UserFacade getInstance(){
		if(userFacadeInstance == null){
			userFacadeInstance = new UserFacade();
		}
		return userFacadeInstance;
	}
	
	private UserFacade(){}
	

	/**
	 * this method returns the list of users came from in-memory storage
	 * @return - list of users
	 */
	public List<User> getAllUsers(){
		return inMemoryUserDao.getAll();
	}
	/**
	 * Performs a check if the user exists
	 * @param name
	 * @return true or false
	 */
	public boolean checkUser(String name){
		List<User> users = inMemoryUserDao.getAll();
		for(User u : users){
			if(name.equals(u.getUserName())){
				return true;
			}
		}
		return false;
    }
	/**
     * Add a new user in the memory
     * @param user
     */
	public OperationStatus addUser(User user){
		inMemoryUserDao.addEntity(user);	
		return OperationStatus.USER_ADDED_SUCCESSFULLY;
	}
	
	/**
	 * this method returns status of user after perform remove operation
	 * @param userId - id of user
	 * @return - status of product either removed or error
	 */
	public OperationStatus removeUser(int userId) {
		if( inMemoryUserDao.getUserIds().contains(userId)) {
			inMemoryUserDao.removeEntity(userId);
			return OperationStatus.USER_REMOVED_SUCCESSFULLY;
		} else {
			return OperationStatus.USER_NOT_FOUND;
		}
	}
	
	/**
	 * this method returns status of user after perform update operation
	 * @param Id - id of user
	 * @param userName - name of user
	 * @return - status of product either update successful or error
	 */
	
	
	
	public OperationStatus updateUser(int id, String	userName, String password ) {
		if(inMemoryUserDao.getUserIds().contains(id)) {
			inMemoryUserDao.updateEntity(id, userName, password);
			return OperationStatus.USER_UPDATED_SUCCESSFULLY;
		} else {
			return OperationStatus.USER_NOT_FOUND;
		}
	}
}
