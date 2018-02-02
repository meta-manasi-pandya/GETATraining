package main.pf.pf3;

/**
 * Class name - LargestDigit
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 1(c)
 */
/* A class to find largest digit in a number using recursion.
 */
public class LargestDigit {
	/**
	 * In this function if the number is zero then we will return 0 else we will 
	 * extract last digit from the number and compare it to the previous one.
	 * 
	 * @param x
	 * @return 0 or newDigit or digit
	 */
	int largestDigit(int x) {
		
		int digit, newDigit;
		if(x == 0){
			return 0;
		}
		else{
			digit = x % 10;
			newDigit = largestDigit(x / 10);
			if(newDigit > digit){
				return newDigit;
			}
			else{
				return digit;
			}
		}
	}
}
