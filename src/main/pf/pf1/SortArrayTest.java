package main.pf.pf1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * A class which contains all the test cases.
 */

public class SortArrayTest {
	SortArray sortCheck = new SortArray();			//Object of the class is created


	@Test											//Test-case 1
	public void testSortArray1() {						
		int[] inputArr= new int[]{1,8,3,4,2};
		assertEquals(0, sortCheck.isSorted(inputArr));
	}
	
	@Test											//Test-case 2
	public void testSortArray2() {						
		int[] inputArr= new int[]{1,2,3,4,5};
		assertEquals(1, sortCheck.isSorted(inputArr));
	}

	@Test										   //Test-case 3
	public void testSortArray3() {
		int[] inputArr= new int[]{5,4,3,2,1};
		assertEquals(2, sortCheck.isSorted(inputArr));
	}

}
