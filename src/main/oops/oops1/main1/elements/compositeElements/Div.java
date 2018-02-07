

/*
 * This file contains class named Div derived from class CompositeElement
 */
package main.oops.oops1.main1.elements.compositeElements;

import main.oops.oops1.main1.elements.CompositeElement;
/**
 * Div is a HTML tag
 * Div is type of Composite Element
 * @author Manasi Pandya
 * @version 1.0
 */
public class Div extends CompositeElement {
	
	// Constructor to initialize the values
	public Div(String id, String className){
		
		// calling parent class for initialization
		super(id,className);
	}
}