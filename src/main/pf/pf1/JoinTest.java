package main.pf.pf1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * A class which contains all the test cases.
 */
public class JoinTest {
	Join result = null;				//Object is created

	@Before
	   public void executedBefore() {
		result = new Join();
	}

	@Test
	public void testJoin1(){				//Test-case 1
		int[] array1= new int[]{1,3,5,7};
		int[] array2= new int[]{2,4,8,9};
		int asize = array1.length;
		int bsize = array2.length;
		int[] finalArray = new int[asize+bsize];
		int[] expected = new int[]{1,2,3,4,5,7,8,9};
		assertArrayEquals(expected, result.join(array1, asize, array2, bsize, finalArray));
	}

	@Test
	public void testJoin2() {					//Test-case 2
		int[] array1= new int[]{9,10,14};
		int[] array2= new int[]{1,1,3,19};
		int asize = array1.length;
		int bsize = array2.length;
		int[] finalArray = new int[asize+bsize];
		int[] expected = new int[]{1,1,3,9,10,14,19};
		assertArrayEquals(expected, result.join(array1, asize, array2, bsize, finalArray));
	}

}
