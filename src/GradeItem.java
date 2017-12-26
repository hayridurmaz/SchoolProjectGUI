package CS102_Project;

public class GradeItem {
	private String courseId;
	private String examId;
	private int grade;

	public GradeItem(String cid, String xid, int grade) {
		this.courseId = cid;
		this.examId = xid;
		this.grade = grade;
	}

	public String getCourseId() {
		return courseId;
	}

	public String getExamId() {
		return examId;
	}

	public int getGrade() {
		return grade;
	}
	public String toString(){
		return ("kekekekeke");
	}

}
