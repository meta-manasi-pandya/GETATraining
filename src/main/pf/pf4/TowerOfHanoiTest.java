package main.pf.pf4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TowerOfHanoiTest {
	TowerofHanoi tower = new TowerofHanoi();
	@Test
	public void testOfOneDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		ArrayList<String> output = new ArrayList<String>();
		
		output = tower.hanoi("A", "B", "C", 1);
		assertEquals(expected, output);
	}
	
	@Test
	public void testOfTwoDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to C");
		expected.add("Move Disk 2 from A to B");
		expected.add("Move Disk 1 from C to B");
		ArrayList<String> output = new ArrayList<String>();
		
		output = tower.hanoi("A", "B", "C", 2);
		assertEquals(expected, output);
	}

	@Test
	public void testOfThreeDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		expected.add("Move Disk 2 from A to C");
		expected.add("Move Disk 1 from B to C");
		expected.add("Move Disk 3 from A to B");
		expected.add("Move Disk 1 from C to A");
		expected.add("Move Disk 2 from C to B");
		expected.add("Move Disk 1 from A to B");
		ArrayList<String> output = new ArrayList<String>();
		
		output = tower.hanoi("A", "B", "C", 3);
		assertEquals(expected, output);
	}


}
