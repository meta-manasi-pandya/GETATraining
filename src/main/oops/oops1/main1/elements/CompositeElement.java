/*
 * This file contains class CompositeElement which is derived from Element
 */
package main.oops.oops1.main1.elements;
import java.util.List;
import java.util.ArrayList;
import main.oops.oops1.main1.Element;
/**
 * This class is responsible for initializing Composite element 
 * i.e. the elements which have more tags inside it. 
 * @author Manasi Pandya
 * @version 1.0
 *
 */
public class CompositeElement extends Element{
	
	// List stores tags inside parent tag
	List<Element> element;
	
	// constructor to initialization of values
	public CompositeElement(String id, String className) {
		
		// calling parent class for initialization
		super(id,className);
		element = new ArrayList<Element>();
	}
	
	// method for adding Tag
	public void add(Element tag){
		
		// Adding tag or element
		element.add(tag);
	}
	
	// Returns list of tags inside parent tag
	List<Element> tagList(){
		
		// returns list of composite element tag
		return this.element;
	}
	
	public Element findById(String id){
		if(this.id == id){
			return this;
		}
		for(Element e : element){
			Element return_tag = e.findById(id);
			if(return_tag!=null){
				return return_tag;
			}
		}
		return null;
	}
	
	public List<Element> findByClass(String className){
		List<Element> list = new ArrayList<Element>();
		if(this.className.equals(className)){
			
			list.add(this); 
		}
		for(Element e : element){
			list.addAll(e.findByClass(className));
		}
		return list;
	}
	
	/**
	 * Recursive function to find the hierarchy of elements
	 * @param element - the composite element
	 * @param count - counts the hierarchy, upto what level the element is
	 * @return - the list
	 */
	public List<String> displayDomRecursive(String spaces){
		
		// loop for adding string into hierarchy
		List<String> hierarchy = new ArrayList<String>();
		hierarchy.add(spaces+"<" + this.getClass().getSimpleName() + " id='"+this.getId()+"'>");
		
		// loop for adding string of composite elements into hierarchy
		for (Element ele : this.tagList()) { 
				
					hierarchy.addAll(ele.displayDomRecursive(spaces+"    "));
				
		}
		hierarchy.add(spaces +"</" + this.getClass().getSimpleName() + ">");

		// returns list
		return hierarchy;
	}
}