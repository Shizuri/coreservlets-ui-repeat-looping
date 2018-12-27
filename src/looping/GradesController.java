package looping;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="gcon")
public class GradesController {

	private QuarterlyGrades[] gradesList = new QuarterlyGrades[3];
	
	public GradesController() {
		QuarterlyGrades q1 = new QuarterlyGrades(new Integer[] {10, 20, 30, 40, 50});
		QuarterlyGrades q2 = new QuarterlyGrades(new Integer[] {11, 21, 31, 41, 51});
		QuarterlyGrades q3 = new QuarterlyGrades(new Integer[] {12, 22, 32, 42, 52});
		gradesList[0] = q1;
		gradesList[1] = q2;
		gradesList[2] = q3;
		
	}

	public QuarterlyGrades[] getGradesList() {
		return gradesList;
	}

	public void setGradesList(QuarterlyGrades[] gradesList) {
		this.gradesList = gradesList;
	}
	
}
