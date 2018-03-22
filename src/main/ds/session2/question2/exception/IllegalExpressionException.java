package main.ds.session2.question2.exception;
/**
 * @author Manasi Pandya
 * Declaring our own exception.
 */
public class IllegalExpressionException extends Exception {
	
	public String message() {
		return "Illegal infix Expression entered";
	}

}
