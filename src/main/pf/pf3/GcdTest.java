package main.pf.pf3;

import static org.junit.Assert.*;

import org.junit.Test;


public class GcdTest {
	GreatestCommonDivisor gcdCheck = new GreatestCommonDivisor();

	@Test
	public void testGreatestCommonDivisor1() {
		int expected = 1;
		assertEquals(expected, gcdCheck.gcd(2,1));
	}

	@Test
	public void testGreatestCommonDivisor2() {
		int expected = 6;
		assertEquals(expected, gcdCheck.gcd(12,18));
	}
	
	@Test
	public void testGreatestCommonDivisor3() {
		int expected = 1;
		assertEquals(expected, gcdCheck.gcd(100,3));
	}
}
