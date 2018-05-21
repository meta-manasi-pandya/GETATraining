package main.pf.pf3;

/**
 * Class name - Remainder
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 1(a)
 */

public class Remainder {
	
	/**
	 * A function to find remainder of two numbers assuming x as dividend and y as divisor using recursion.
	 * @param x
	 * @param y
	 * @return result
	 */
	 public int rem(int x, int y) {
		 int result = 0;
		 if(y==0) {
			 return x;
		 }
		 else {
			 result = x - y;
			 if(result < y) {
				 return result;
			 }
			 else {
				 return rem(result,y);
			 }
		 }
	 }
}
