package main.pf.pf1;

/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 6
   A class to join two sorted arrays and generate third sorted array.
 */
public class Join {
	/**
	 * The function maintains three counters, one for each of the two
	 * arrays and one for maintaining the current index of final sorted
	 * array. It checks if we have reached the end of any of the arrays.
	 * If No: Compare current elements of both arrays and copy smaller
	 * element into third sorted array, and increment counter of array
	 * containing smaller element.
	 * If Yes: Copy all remaining elements of arrays.
	 */
	public int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int i=0, j=0, k=0;
		while((i < asize) && (j < bsize)){
			if(a[i] < b[j])			//Checking which array contains smaller element
				c[k++] = a[i++];	//Post increment in the index of both array so that it points to new element now
			else if(a[i] > b[j])
				c[k++] = b[j++];
			else{
				c[k++] = a[i++];
				c[k++] = b[j++];
			}
		}
		while(i < asize)
			c[k++] = a[i++];		//Copy remaining elements of a[]
		while(j < bsize)
			c[k++] = b[j++];		//Copy remaining elements of b[]
		
		return c;
	}
}
