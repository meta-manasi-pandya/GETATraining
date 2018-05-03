package main.pf.pf4;

import java.util.ArrayList;
import java.util.List;
/**
 * Class name-TowerofHanoi
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 1
 */
public class TowerofHanoi {
	private List<String> discs = null;
	public TowerofHanoi() {
		discs = new ArrayList<String>();
	}
	/**
	 * This function consists of three rods or towers with 'n' disks placed one over the other.
	 * Two rules are:
	 * 1. Only one disk can be moved at a time.
	 * 2. Larger disk cannot be placed over smaller one.
	 * @param sourceRod
	 * @param destinationRod
	 * @param auxiliaryRod
	 * @param numOfDisks
	 * @return discs
	 */
	public List<String> hanoi(String sourceRod, String destinationRod, String auxiliaryRod, int numOfDisks) {
		if(numOfDisks == 1) {
			//Move the bottom disk to the destination rod.
			String solution1 = "Move Disk " + numOfDisks + " from " + sourceRod + " to " + destinationRod;
			discs.add(solution1);
			return discs;
		}
		//Move the top n-1 disk to the auxiliary rod.
		hanoi(sourceRod, auxiliaryRod, destinationRod, numOfDisks - 1);
		String solution2 = "Move Disk " + numOfDisks + " from " + sourceRod + " to " + destinationRod;
		discs.add(solution2);
		
		//Move the n-1 disks from auxiliary rod to the destination rod.
		return hanoi(auxiliaryRod, destinationRod, sourceRod, numOfDisks - 1);
	}
}
