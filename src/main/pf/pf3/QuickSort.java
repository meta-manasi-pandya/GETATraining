package main.pf.pf3;
/**
 * Class name - QuickSort
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 3
 */
/* A class to sort an array using recursion by Quick sort method.
 */
public class QuickSort {
	/**
	 * This function selects a pivot element and partitions all elements less than the pivot
	 * in the left part and greater than the pivot in the right part.
	 * @param arr
	 * @param low
	 * @param high
	 * @return arr
	 */
	
	  public int partition(int arr[], int low, int high) {
	        int pivot = arr[high]; 
	        int i = (low-1);
	        for (int j=low; j<high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	        return i+1;
	    }
	  
	  public int[] sort(int arr[], int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	        return arr;
	    }
}

