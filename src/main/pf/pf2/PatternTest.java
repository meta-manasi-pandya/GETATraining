package main.pf.pf2;
import static org.junit.Assert.*;

import org.junit.Test;


public class PatternTest {
	Pattern patternObject = new Pattern();
    @Test
    public void testPattern(){
        String expected[]={"    1    ",
                           "   121   ",
                           "  12321  ",
                           " 1234321 ",
                           "123454321", 
                           " 1234321 ",
                           "  12321  ",
                           "   121   ",
                           "    1    "};
                String actual[]=patternObject.pyramid(5);
                for(String i:actual){
                	 System.out.print(i);
                }
                assertArrayEquals(expected, actual);
        
    }
    @Test
    public void testPatternSpaces(){
        String expected="  ";
        String actual=patternObject.getSpaces(5,3);
        assertEquals(expected, actual);
    }
    @Test
    public void testPatternNumber(){
        String expected="123454321";
        String actual=patternObject.getNumber(4,5);
        assertEquals(expected, actual);
    }

}