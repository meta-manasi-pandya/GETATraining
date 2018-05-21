package main.pf.pf4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class PermutationsTest {
	private Permutations permute = null;
	@Before
	public void executedBefore() {
		permute = new Permutations();
	}
	@Test
	public void testPermutations1() {
		String inputString = "ABC";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("ABC");
		expectedOutput.add("ACB");
		expectedOutput.add("BAC");
		expectedOutput.add("BCA");
		expectedOutput.add("CBA");
		expectedOutput.add("CAB");
		List<String> resultantOutput = permute.generatePermutations(inputString, 0, 2);
		
		assertEquals(expectedOutput,resultantOutput);


	}
	@Test
	public void testPermutations2() {
		String inputString = "ABCD";
		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("ABCD");
		expectedOutput.add("ABDC");
		expectedOutput.add("ACBD");
		expectedOutput.add("ACDB");
		expectedOutput.add("ADCB");
		expectedOutput.add("ADBC");
		
		expectedOutput.add("BACD");
		expectedOutput.add("BADC");
		expectedOutput.add("BCAD");
		expectedOutput.add("BCDA");
		expectedOutput.add("BDCA");
		expectedOutput.add("BDAC");
		
		expectedOutput.add("CBAD");
		expectedOutput.add("CBDA");
		expectedOutput.add("CABD");
		expectedOutput.add("CADB");
		expectedOutput.add("CDAB");
		expectedOutput.add("CDBA");
		
		expectedOutput.add("DBCA");
		expectedOutput.add("DBAC");
		expectedOutput.add("DCBA");
		expectedOutput.add("DCAB");
		expectedOutput.add("DACB");
		expectedOutput.add("DABC");
		
		List<String> resultantOutput = permute.generatePermutations(inputString, 0, 3);
		assertEquals(expectedOutput,resultantOutput);
	}
}
