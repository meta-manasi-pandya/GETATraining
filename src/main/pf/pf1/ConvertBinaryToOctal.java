package main.pf.pf1;

/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 1
 * A class to convert a given binary number to its equivalent octal number.
 */
public class ConvertBinaryToOctal {
	/**
	 * This function converts a binary number to its octal equivalent by first converting binary
	 * to decimal and then decimal to octal conversion. Conversion of binary to decimal is done
	 * by multiplying every digit(right to left) with 2 to the power 0, 1, 2 and so on
	 * respectively. Decimal to Octal is done by iteratively adding the remainder of division of
	 * decimal number by 8 multiplied by a counter which is multiple of 10.
	 */
	public int convertBinarytoOctal(int inputBinary){
		int octalNumber = 0, decimalNumber = 0, counter = 0;
			
		while(inputBinary != 0)	{			//Binary to Decimal conversion
		    decimalNumber += (inputBinary % 10) * Math.pow(2, counter);
		    ++counter;						//Incrementing power of 2
		    inputBinary /= 10;				
		}
		
		counter = 1;
		
		while (decimalNumber != 0){			//Decimal to Octal conversion
		    octalNumber += (decimalNumber % 8) * counter;
		    decimalNumber /= 8;				
		    counter *= 10;					//Counter of multiple of 10
		}
	
    return octalNumber;
	}
}
	

