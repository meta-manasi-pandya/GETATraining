
/*
 * This file contains class named Span derived from class CompositeElement
 */
package main.oops.oops1.main1.elements.compositeElements;

import main.oops.oops1.main1.elements.CompositeElement;
/**
 * Span is a HTML tag
 * Span is type of Composite Element
 * @author Manasi Pandya
 * @version 1.0
 */
public class Span extends CompositeElement{
	
	// Constructor to initialize the values
	Span(String id, String className){
		
		// calling parent class for initialization
		super(id , className);
	}
}
