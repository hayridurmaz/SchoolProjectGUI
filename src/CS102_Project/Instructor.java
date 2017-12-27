package CS102_Project;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {
	List<Course> courses;

	public Instructor(String name) {
		super(name);
		courses = new ArrayList<>();
	}

	public void addCourse(Course x) {
		courses.add(x);
	}

	public void initEmail() {
		String name = this.getName();
		String firstName = name.substring(0, name.indexOf(" ")).trim();
		String lastName = name.substring(name.indexOf(" ") + 1).trim();

		this.setEmail(firstName + "." + lastName + "@ozyegin.edu.tr");
	}

	public void registerExamGrades(String courseId, String examId) {
		// TODO
	}

	public void listGradesForExam(String courseId, String examId) {
		// TODO
	}

	public void printAverageGradeForExam(String courseId, String examId) {
		// TODO
	}
}
