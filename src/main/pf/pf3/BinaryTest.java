package main.pf.pf3;

import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryTest {
	BinarySearch search=new BinarySearch();

	@Test
	public void testBinarySearch1() {
		int expected=1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, search.binarySearch(input, 77,0,input.length-1));
	}
	@Test
	public void testBinarySearch2() {
		int expected=-1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, search.binarySearch(input,88,0,input.length-1));
	}

}
