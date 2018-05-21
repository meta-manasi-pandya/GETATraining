package main.pf.pf4;

import java.util.ArrayList;
import java.util.List;
/**
 * Class name-Permutations
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 2
 */
public class Permutations {
	private List<String> permute = null;
	
	public Permutations() {
		permute = new ArrayList<String>();
	}
	/**
	 * Below function swaps characters at two positions.
	 * @param a
	 * @param i
	 * @param j
	 * @return charArray
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	/**
	 * Below function returns all permutations of string using backtracking.
	 * Assuming each character to be unique.
	 * @param str
	 * @param start
	 * @param end
	 * @return permute
	 */
	public List<String> generatePermutations(String str, int start, int end) {
		if(start == end) {
			permute.add(str);
		}
		else {
			for(int i = start; i <= end; i++) {
				str = swap(str, start, i);
				generatePermutations(str, start+1, end);
				str = swap(str, start,i);
			}
		}
		return permute;
	}
}
