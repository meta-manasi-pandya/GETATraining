package main.pf.pf2;
import static org.junit.Assert.*;

import org.junit.Test;


public class TriangularTest {
	TriangularPattern patternObject=new TriangularPattern();
    @Test
    public void testTriangularPattern(){
        String expected[]={"12345",
                           " 1234",
                           "  123",
                           "   12",
                           "    1"};
                String actual[]=patternObject.print(5);
                assertArrayEquals(expected, actual);
        
    }
    @Test
    public void testTriangularPatternSpaces(){
        String expected="  ";
        String actual=patternObject.spaces(3,5);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangularPatternNumber(){
        String expected="12";
        String actual=patternObject.numbers(2,5);
        assertEquals(expected, actual);
    }

}
