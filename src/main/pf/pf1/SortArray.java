package main.pf.pf1;

/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 5
   A class to check whether an array is sorted(ascending or descending order) or not sorted.
 */
public class SortArray{
	/**
	 * This function takes an array as an input and returns '0' if not sorted, '1' if sorted in
	 * ascending order and '2' if sorted in descending order.
	 */
	public int isSorted(int input[]){
		int inputSize = input.length;
		int rowCounter, result;
		for(rowCounter=1 ; rowCounter<inputSize ; ++rowCounter)	{	//Descending order
			if(input[rowCounter] < input[rowCounter-1])
					break;
		}
		if(rowCounter<inputSize){  									//Failed descending order
			for(rowCounter=1 ; rowCounter<inputSize ; ++rowCounter){	//Ascending order
				if(input[rowCounter] > input[rowCounter-1])
					break;
			}
			if(rowCounter < inputSize){
				result = 0;											//Array is unsorted
				return result;
			}
			else{
				result = 2;											//Array is in descending order
				return result;
			}
		}
		else{
			result = 1;												//Array is in ascending order
			return result;
		}
	}
}
