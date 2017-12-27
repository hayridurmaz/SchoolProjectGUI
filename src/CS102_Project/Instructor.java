package CS102_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				student.addGrade(new GradeItem(courseId, examId, (new Random().nextInt(100))));
			}
		}
		// TODO
	}

	public void listGradesForExam(String courseId, String examId) {
		System.out.println(courseId + " " + examId + " grades are:");
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				System.out.println(student.getGradeItem(courseId, examId).toString());
			}
		}
		// TODO
	}

	public void printAverageGradeForExam(String courseId, String examId) {
		int sum = 0;
		int count = 0;
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				sum += student.getGradeItem(courseId, examId).getGrade();
				count++;
			}
		}
		System.out.println(courseId + " " + examId + " avarage grade is: " + ((double) sum / count));
		// TODO
	}
}
