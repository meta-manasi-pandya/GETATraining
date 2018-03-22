package main.ds.session2.question1;
/**
 * This class represents a candidate.
 * @author Manasi Pandya
 */
public class Candidate implements Comparable<Candidate> {
	private String name;
	private float marks;
	private String collegeName;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	Candidate(String name, float marks) {
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Candidate candidate) {		/*To compare candidate's marks*/
		if(this.marks > candidate.marks)
			return -1;
		else if( this.marks == candidate.marks)
			return 0;
		else
			return 1;
	}

}
