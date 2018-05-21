package main.pf.pf1;
import java.util.Arrays;
/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 2
   A class to remove duplicate elements from a given array which may or may not be sorted.
 */

public class RemoveDuplicate {
	/**This function removes all occurrences of duplicate elements. In this we created a new array which contains
	 * all the unique elements of input array. First element of input array is copied as it is and afterwards element
	 * from 'array' is checked in 'input' for duplicates. If no duplicate is found then it is added to 'array'. 
	 */
	public int[] removeDuplicate(int input[]) {
		int flag=0 ,j=0;
		int[] array = new int[10];
		int inputSize = input.length;
		for(int i=0; i<inputSize; i++) {
			flag = 0;
			for(int k=0; k<j; k++)
				if(array[k] == input[i])
					flag =1;
			if(flag==0)
				array[j++] = input[i];
		}
		
		return Arrays.copyOfRange(array, 0, j);     	//Returns array from range 0 to j
	}
}
