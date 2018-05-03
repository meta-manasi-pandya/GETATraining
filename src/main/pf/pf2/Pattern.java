package main.pf.pf2;
/**
 * Class name - Pattern
 * @author Manasi Pandya
 * Assignment - 1
 */
/**
 * Class contains 3 methods
 * First method returns the string containing spaces
 * Second method returns the string containing numbers
 * Last method returns the string containing final pyramid
 */
public class Pattern {
	 /**
     * This function returns String of spaces
     * @param n
     * @param row
     * @return str
     */
	public String getSpaces(int n, int row) {
		String str = "";
		for(int i=1; i<=n-row; i++) {
			str = str + " ";
		}
		return str;
	}
	 /**
     * This function returns String of spaces
     * @param row
     * @param n
     * @return str
     */
	public String getNumber(int row, int n) {
		String str = ""; 
		for(int i=1; i<=n; i++) {
			str = str + i;
		}
		for(int i=n-1; i>=1; i--) {
			str = str + i;
		}
		return str;
	}
	/**
     * This function returns final pattern
     * @param n
     * @return str
     */
	public String[] pyramid(int n) {
		String[] str = new String[(n*2)-1];
		int j = 0;
		for(int i=1; i<=n; i++) {
			str[j] = getSpaces(n,i);
			str[j] += getNumber(n,i);
			str[j++] += getSpaces(n,i);
		}
		for(int i=n-1; i>=1; i--) {
			str[j] = getSpaces(n,i);
			str[j] += getNumber(n,i);
			str[j++] += getSpaces(n,i);
		}
		return str;
	}
}
