package main.pf.pf3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RemainderTest {
	private Remainder objectRemainder = null;
	
	@Before
	public void executedBefore() {
		objectRemainder = new Remainder();
	}
	@Test
	public void testRemainder1() {
		int expected = 0;
		assertEquals(expected, objectRemainder.rem(2,1));
	}
	
	@Test
	public void testRemainder2() {
		int expected = 2;
		assertEquals(expected, objectRemainder.rem(2,0));
	}
	
	@Test
	public void testRemainder3() {
		int expected = 1;
		assertEquals(expected, objectRemainder.rem(100,3));
	}

}
