package main.pf.pf1;
/**
 * Class which contains main function
 */
public class SortArrayMain {

	public static void main(String[] args) {
		SortArray sort = new SortArray();								//Object is created
		int[] arrayInput = new int[]{1,2,3,4};
		int counter = sort.isSorted(arrayInput);						//Passing array in function
		if(counter==0)
			System.out.println("Array is not sorted!");
		else if(counter==1)
			System.out.println("Array is sorted in ascending order!");
		else if(counter==2)
			System.out.println("Array is sorted in descending order!");

	}

}
