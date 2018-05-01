package main.ds.session4.question2.main;

/**
 * Contains the properties of a person like name, age etc.
 * 
 * @author Manasi Pandya
 *
 */
public class Person {
	private int age;
	private String name;
	
	/**
	 * Constructor
	 * 
	 * @param age
	 * @param name
	 */
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	/* getters and setters */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}