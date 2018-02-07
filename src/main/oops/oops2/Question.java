package main.oops.oops2;

import java.util.ArrayList;
/**
 * Class name-Question
 * 
 * @version 1.0
 * @author Manasi Pandya
 */
/*
 * This class represents various Questions
 */
public class Question implements Comparable<Question> {
	String type;
	int questionId;
	String questionHeading;
	ArrayList<String> listOfOptions = new ArrayList<String>();
	@Override
	public int compareTo(Question ques) {
		// TODO Auto-generated method stub
		return (this.questionHeading).compareTo(ques.questionHeading);
	}
	
}
