package main.pf.pf1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * A class which contains all the test cases.
 */

public class LongestSequenceTest{
	LongestSequence lsequence = new LongestSequence();		//Object is created

	@Test
	public void testLongestSequence1() {								//Test-case 1
		int[] inputArr= new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] expectedArr= new int[]{1,2,4,5,6,7,8,9};
		
		assertArrayEquals(expectedArr, lsequence.longestSequence(inputArr));
	}
	
	@Test
	public void testLongestSequence2() {								//Test-case 2
		int[] inputArr= new int[]{-1,1,2,-2};
		int[] expectedArr= new int[]{-1,1,2};
		
		assertArrayEquals(expectedArr, lsequence.longestSequence(inputArr));
	}

}
