package main.pf.pf1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Arrays;
/**
 * A class which contains all the test cases.
 */

public class FCFSTest {
	FCFS result = new FCFS();				//Object of the class

	@Test
	public void testFCFS(){ 						//Test-case 1
		int arrivalTime[] = new int[]{1, 5, 9, 25};
		int jobSize[] = new int[]{12, 7, 2, 5};
		int[][] output = result.FCFSMethod(arrivalTime, jobSize);
		int expected[][] = new int[][]{{1,1,0,1,12}, {2,5,8,13,19}, {3,9,11,20,21}, {4,25,0,25,29}};
		assertTrue(isArrayEqual(expected , output));
	}
	
	//Function to check if both 2-D arrays are equal or not
	
	public boolean isArrayEqual(int expected[][], int output[][]){
		for (int rowcounter=0; rowcounter<expected.length; rowcounter++){
	        for (int colcounter=0; colcounter<expected[rowcounter].length; colcounter++){
	            if (expected[rowcounter][colcounter] != output[rowcounter][colcounter]){
	                return false;
	            }
	        }
	    }

	    return true;
	}

}
