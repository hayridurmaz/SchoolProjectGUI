package CS102_Project;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private List<Course> courses;
	private List<Instructor> instructors;
	private List<Student> students;

	public Department(String name) {
		this.name = name;
		courses = new ArrayList<>();
		instructors = new ArrayList<>();
		students = new ArrayList<>();
	}

	public void addInstructor(String name) {
		instructors.add(new Instructor(name));
	}

	public void addStudent(String name) {
		students.add(new Student(name));
	}

	public void assignInstructorToCourse(String iName, String courseId) {
		Course c = getCourse(courseId);
		if (c == null) {
			System.out.println("There is no such course");
			return;
		}
		Instructor i = getInstructorByName(iName);
		if (i == null) {
			System.out.println("There is no such instructor.");
			return;
		}
		c.setInstructor(i);

	}

	public void createCourse(String cid, String cname) {
		Course c = new Course(cid, cname);
		courses.add(c);

	}

	public Course getCourse(String name) {
		for (Course course : courses) {
			if (course.getName().equals(name) || course.getId().equals(name))
				return course;
		}
		return null;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Instructor getInstructorByName(String name) {
		for (Instructor i : instructors) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}

	public void listInstructors() {
		System.out.println("Instructors registered in this department are:");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.toString());
		}

	}

	public void listsStudents() {
		System.out.println("Students registered in this department are:");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public void listCourses() {
		System.out.println("Courses given by this department are:");
		for (Course course : courses) {
			System.out.println(course.toString());
		}

	}

}
