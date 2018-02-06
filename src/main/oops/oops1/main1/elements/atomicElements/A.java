

package main.oops.oops1.main1.elements.atomicElements;
/*
 * This file contains class A, which is derived from class AtomicElement
 */
import main.oops.oops1.main1.elements.AtomicElement;
/**
 * @author Manasi Pandya
 * Anchor is a HTML tag, in this we denote Anchor as "A"
 * Anchor is type of Atomic Element
 */
public class A extends AtomicElement {
	// Attribute of Anchor tag
		String href;
		
		/**
		 *  Constructor to initialize the values
		 * @param id 
		 * @param href
		 * @param className
		 */
		public A(String id, String href, String className){
			
			// calling parent class for initialization
			super(id,className);
			
			// initializing the value
			this.href= href;
		
		}
}