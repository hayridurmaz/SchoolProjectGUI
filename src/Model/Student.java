package Model;

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
		if(x.getInstructor()==null){
			System.out.println("Course not available");
			return;
		}
		enrolledCourses.add(x);
		x.addStudent(this);
		// TODO
	}

	public void dropCourse(Course y) {
		enrolledCourses.remove(y);
		y.removeStudent(this);
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
	
	public ArrayList<GradeItem> getGradeItemsOfACourse(String courseId) {
		ArrayList<GradeItem> gradearr = new ArrayList<>();
		for (GradeItem grade : grades) {
//			System.out.println("+"+courseId);
//			System.out.println("-"+grade.getCourseId());
			if (grade.getCourseId().equals(courseId)) {
				 gradearr.add(grade);
			}
		}
		return gradearr;
	}

	public void listGrades() {
		for (Course course : enrolledCourses) {
			System.out.print(course.getId()+" grades of Mustafa Caliskan: ");
			for (GradeItem grade : grades) {
				if(grade.getCourseId().equals(course.getId())){
					System.out.print(grade.toString());
				}			
			}
			System.out.println();
		}

	}
}
