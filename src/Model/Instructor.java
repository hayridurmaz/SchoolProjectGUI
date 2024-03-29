package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Instructor extends Person {
	List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

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
		boolean hasCourseInst = false;
		for (Course course : courses) {
			if (course.getId().equals(courseId)) {
				hasCourseInst = true;
				for (Student student : course.getStudents()) {
					student.addGrade(new GradeItem(courseId, examId, (new Random().nextInt(100))));
				}
			}
		}
		if (!hasCourseInst) {
			System.out.println("Instructor " + this.getName() + " cannot grade the course " + courseId);
		}

		// TODO
	}

	public void registerExamGrades(String courseId, String examId, ArrayList<Integer> grade) {
		boolean hasCourseInst = false;
		for (Course course : courses) {
			if (course.getId().equals(courseId)) {
				hasCourseInst = true;
				int i=0;
				for (Student student : course.getStudents()) {
					student.addGrade(new GradeItem(courseId, examId, grade.get(i)));
					i++;
				}
			}
		}
		if (!hasCourseInst) {
			System.out.println("Instructor " + this.getName() + " cannot grade the course " + courseId);
			JOptionPane.showMessageDialog(null, "Instructor " + this.getName() + " cannot grade the course " + courseId,
					"Error", 0);
		}

		// TODO
	}

	public void listGradesForExam(String courseId, String examId) {
		System.out.println(courseId + " " + examId + " grades are:");
		for (Course course : courses) {
			if (course.getId().equals(courseId)) {
				for (Student student : course.getStudents()) {
					System.out.println(student.getName() + ": " + student.getGradeItem(courseId, examId).toString());
				}
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
	
	public double getAvarage(String courseId, String examId) {
		int sum = 0;
		int count = 0;
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
//				System.out.println(courseId);
//				System.out.println(examId);

				if(student.getGradeItem(courseId, examId)!=null){
					sum += student.getGradeItem(courseId, examId).getGrade();
					count++;
				}
			
			}
		}
		return ((double) sum / count);
		// TODO
	}

	public String toString() {
		return getId() + ", " + getName() + ", " + getEmail();
	}
}
