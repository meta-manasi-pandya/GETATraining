package main.pf.pf2;
/**
 * Class name - TriangularPattern
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 2
 */

/* 
 * This file contains the class triangularPattern to print pattern
 */
/**
 * Class contains 3 methods
 * First method returns the string containing spaces
 * Second method returns the string containing numbers
 * Last method returns the string containing final pyramid
 */
public class TriangularPattern {
    /**
     * This function returns String of spaces
     * @param row
     * @param n
     * @return str
     */
    public String spaces(int row,int n) {
        String str="";
        int spaces=n-row;
        for(int i=0;i<spaces;i++) {
            str+=" ";
        }
        return str;
    }
    /**
     * This function returns String of numbers
     * @param row
     * @param n
     * @return str
     */
    public String numbers(int row,int n) {
        String str="";
        int i;
        for(i=1;i<=row;i++) {
            str+=i;
        }
        return str;
    }
    /**
     * This function returns final pattern
     * @param n
     * @return pattern
     */
    public String[] print(int n) {
        int j=0;
        String pattern[] = new String[n];
        for(int i=n;i>0;i--) {
            pattern[j]=(spaces(i,n)+numbers(i,n));
            j++;
        }
        return pattern;                                    //returns final pattern
    }    
}