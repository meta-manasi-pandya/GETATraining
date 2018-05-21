package main.pf.pf3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LargestDigitTest {
	private LargestDigit ldigit = null;
	@Before
	public void executedBefore() {
		ldigit = new LargestDigit();
	}
	@Test
	public void testLargestDigit1() {
		int expected = 2;
		assertEquals(expected, ldigit.largestDigit(2));
	}
	
	@Test
	public void testLargestDigit2() {
		int expected = 9;
		assertEquals(expected, ldigit.largestDigit(1257369));
	}
	
	@Test
	public void testLargestDigit3() {
		int expected = 4;
		assertEquals(expected, ldigit.largestDigit(444));
	}
}
