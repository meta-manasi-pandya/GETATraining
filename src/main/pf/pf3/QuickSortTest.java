package main.pf.pf3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class QuickSortTest {
	private QuickSort qsort = null;
	@Before
	public void executedBefore() {
		qsort = new QuickSort();
	}
	@Test
	public void testQuickSort() {
		int expected[] = new int[]{2,5,8,9,10,11,55,77};
		int input[] = new int[]{2,5,8,9,10, 77, 55, 11};
		assertArrayEquals(expected, qsort.sort(input,0,input.length-1));
	}

}
