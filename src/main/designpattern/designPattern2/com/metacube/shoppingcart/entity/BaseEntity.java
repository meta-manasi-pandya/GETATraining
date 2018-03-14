package main.designpattern.designPattern2.com.metacube.shoppingcart.entity;
/**
 * this class provide Id to all objects like product, user, shoppingCart etc
 * @author Manasi Pandya
 *
 */
public class BaseEntity {
	private static int count = 0;
	protected int id;

	public BaseEntity(){
		this.id = count++;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
