package main.pf.pf3;

import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSortTest {
	QuickSort qsort = new QuickSort();

	@Test
	public void testQuickSort() {
		int expected[] = new int[]{2,5,8,9,10,11,55,77};
		int input[] = new int[]{2,5,8,9,10, 77, 55, 11};
		int size = input.length -1;
		int sortedInput[] = qsort.sort(input,0,size);
		assertArrayEquals(expected, qsort.sort(input,0,input.length-1));
	}

}
