package looping;

import java.util.Arrays;

public class QuarterlyGrades {

	private Integer[] grades = new Integer[5];
	
	public QuarterlyGrades(Integer[] grades) {
		this.grades = grades;
	}

	public Integer[] getGrades() {
		return grades;
	}

	public void setGrades(Integer[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "QuarterlyGrades [grades=" + Arrays.toString(grades) + "]";
	}
}
