package main.pf.pf1;

import java.util.Arrays;
/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 3
   A class to find longest increasing sequence from an array of n integer values.
 */

public class LongestSequence {
	/** 
	 * This function returns the longest increasing sequence in input[]. 'm' is the size of current longest
	 * sequence and 'j' is its position. 'n' is the size of last longest sequence detected and 'k' is its position.
	 * In this first we check if the next element is greater than the previous element or not. If it is greater then 
	 * our sequence is broken and now we will check if the size of current sequence(m) is greater than previous
	 * one(n) or not and we will check now from this location. If it is not greater then we will simply increment
	 * 'm' i.e. size of current sequence.
	 */
	 int[] longestSequence(int input[]) {
		
		 int m=1, n=0, k=0, j=0;				//Initializing counters
		 
		 for(int i=1; i<input.length; i++) {
			 if(input[i] <= input[i-1])	{		//Checking current element with previous one
				 if(m>n) {						//If current sequence is greater than previous one
					 n = m;
					 k = j;
				 }
				 m = 1;
				 j = i;							//Now continuing finding sequence with last location
			 }
			 else
				 m++;
		 }
		 
		 if(m>n) {
			 n = m;
			 k = j;
		 }
		 
		 return Arrays.copyOfRange(input, k, k+n);  //Return array from k to k+n range
	 }
}
