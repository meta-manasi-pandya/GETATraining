package main.pf.pf3;

import static org.junit.Assert.*;

import org.junit.Test;


public class LinearSearchTest {
	LinearSearch search=new LinearSearch();

	@Test
	public void testLinearSearch1() {
		int expected=1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, search.linearSearch(input, 77,0));
	}
	@Test
	public void testLinearSearch2() {
		int expected=-1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, search.linearSearch(input,88,0));
	}


}
