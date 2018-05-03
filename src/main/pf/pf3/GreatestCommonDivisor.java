package main.pf.pf3;

/**
 * Class name - GreatestCommonDivisor
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 1(b)
 */
/* A class to find GCD using recursion.
 */
public class GreatestCommonDivisor {
	/**
	 * This function finds GCD of two numbers by successive division method.
	 * @param x
	 * @param y
	 * @return x
	 */
	public int gcd(int x, int y) {
	
		 if (y != 0)
	            return gcd(y, x % y);
	        else
	            return x;
		
	}
	
}
