package CS102_Project;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private List<Course> enrolledCourses;
	private List<GradeItem> grades;

	public Student(String name) {
		super(name);
		enrolledCourses = new ArrayList<>();
		grades = new ArrayList<>();
	}

	public void initEmail() {
		String name = this.getName();
		String firstName = name.substring(0, name.indexOf(" ")).trim();
		String lastName = name.substring(name.indexOf(" ") + 1).trim();

		this.setEmail(firstName + "." + lastName + "@ozyegin.edu.tr");
	}

	public void registerToCourse(Course x) {
		enrolledCourses.add(x);
		// TODO
	}

	public void dropCourse(Course y) {
		enrolledCourses.remove(y);
		// TODO
	}

	public void addGrade(GradeItem g) {
		grades.add(g);
	}

	public GradeItem getGradeItem(String courseId, String examId) {
		for (GradeItem grade : grades) {
			if (grade.getCourseId().equals(courseId) && grade.getExamId().equals(examId)) {
				return grade;
			}
		}
		return null;
	}

	public void listGrades() {
		for (GradeItem grade : grades) {
			System.out.println(grade.toString());
		}
	}
}
