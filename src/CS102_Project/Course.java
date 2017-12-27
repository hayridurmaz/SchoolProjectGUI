package CS102_Project;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String id;
	private String name;
	private Instructor instructor;
	private List<Student> students;

	public Course(String id, String name) {
		this.id = id;
		this.name = name;
		students = new ArrayList<Student>();
	}

	public void addStudent(Student x) {
		students.add(x);
	}

	public void removeStudent(Student y) {
		students.remove(y);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void listStudents() {
		for (Student student : students) {
			student.toString();
		}
	}

	public String toString() {
		return id + " " + name;
	}

}
