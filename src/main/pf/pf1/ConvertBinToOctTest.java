package main.pf.pf1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * A class which contains all the test cases.
 */

public class ConvertBinToOctTest {
	
	ConvertBinaryToOctal binToOct = new ConvertBinaryToOctal();	//Object of the class


	@Test													//Test-case 1
	public void testConvertBinaryToOctalPositive() {								
		assertEquals(65, binToOct.convertBinarytoOctal(110101));
	}
	
	@Test													//Test-case 2
	public void testConvertBinaryToOctalNegative() {
		assertEquals(66, binToOct.convertBinarytoOctal(111100));
	}

}
