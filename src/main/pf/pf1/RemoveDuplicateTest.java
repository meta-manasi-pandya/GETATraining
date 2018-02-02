package main.pf.pf1;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * A class which contains all the test cases.
 */

public class RemoveDuplicateTest {
	
	RemoveDuplicate duplicate = new RemoveDuplicate();		//Object is created

	@Test
	public void testRemoveDuplicate1() {						   //Test-case 1
		
		int[] inputArray= new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int[] expectedArray= new int[]{2,5,4,6,3,8,9,0};
		
		assertArrayEquals(expectedArray, duplicate.removeDuplicate(inputArray));
	}
	
	@Test
	public void testRemoveDuplicate2() {							//Test-case 2
		
		int[] inputArray= new int[]{1};
		int[] expectedArray= new int[]{1};
		
		assertArrayEquals(expectedArray, duplicate.removeDuplicate(inputArray));
	}

}
