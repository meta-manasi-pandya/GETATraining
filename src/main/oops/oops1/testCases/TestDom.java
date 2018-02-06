package main.oops.oops1.testCases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.oops.oops1.main1.Dom;
import main.oops.oops1.main1.Element;
import main.oops.oops1.main1.Root;
import main.oops.oops1.main1.elements.AtomicElement;
import main.oops.oops1.main1.elements.CompositeElement;
import main.oops.oops1.main1.elements.atomicElements.A;
import main.oops.oops1.main1.elements.atomicElements.Img;
import main.oops.oops1.main1.elements.compositeElements.Div;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDom {
	static Dom dom;
	static CompositeElement div1;
	static CompositeElement root; 
	static CompositeElement div2;
	static CompositeElement div3;
	static AtomicElement a;
	static AtomicElement img3;
	static AtomicElement img1;
	static AtomicElement img2;
	
	@BeforeClass
	 public static void doBefore() {
		root = new Root("0","root");
		dom = new Dom(root);
		div1 = new Div("1", "abc");
		div2 = new Div("0", "abc");
		a = new A("9", "ab", "asa");
		div3 = new Div("4", "abcd");
		img3 = new Img("6", "ab", "abcd");
		img1 = new Img("3", "ab", "abc"); 
		img2 = new Img("8", "ab", "abcd"); 
		((CompositeElement) root).add(div1);
		div1.add(div2);
		div2.add(a);
		div2.add(div3);
		div3.add(img3);
		((CompositeElement) root).add(img1);
		div1.add(img2);
	}
	@Test
	public void testClassName() {
		
		List<Element> actual2 = dom.findElementByClass("abcd");
		List<String> result = new ArrayList<String>();
		for ( Element listElement : actual2) {
 			result.add(listElement.getClass().getSimpleName());
 		}
		List<String> expected = new ArrayList<String>();
		expected.addAll( Arrays.asList("Div","Img","Img"));
		assertEquals(expected,result);
		
	}
	
	@Test
	public void testID() {
		
		String actual = dom.findElementByID("3").getClass().getSimpleName();
		String expected = "Img" ;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testDom() {
		
		List<String> expected= new ArrayList<String>();
		expected.addAll(Arrays.asList("<Root id='0'>",
				"    <Div id='1'>",
				"        <Div id='0'>",
				"            <A id='9'>",
				"            <Div id='4'>",
				"                <Img id='6'>",
				"            </Div>",
				"        </Div>",
				"        <Img id='8'>",
				"    </Div>",
				"    <Img id='3'>",
				"</Root>" ));
		
		List<String> actual = dom.displayDOM();
		
		assertEquals(expected,actual);
		
	}

}