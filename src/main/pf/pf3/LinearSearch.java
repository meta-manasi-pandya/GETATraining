package main.pf.pf3;

/**
 * Class name - LinearSearch
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 2(a)
 */
/* A class to find a number using recursion by linear search method.
 */
public class LinearSearch {
	
	/**
	 * This function searches a given value in an array using linear search approach.
	 * 'loc' gives us the location in the array from which we want to start searching.
	 * @param array
	 * @param n
	 * @param loc
	 * @return -1 or 1
	 */
	public int linearSearch(int array[],int n,int loc) {
		if(loc >= array.length) {
			return -1;
		}
		if(array[loc]==n) {
			return 1;
		}
			return linearSearch(array,n,loc+1);
	}
}
