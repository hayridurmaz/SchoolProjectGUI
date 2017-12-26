package CS102_Project;

import java.util.List;

public class Department {
	private String name;
	private List<Course> courses;
	private List<Instructor> instructors;
	private List<Student> students;

	public Department(String name) {
		this.name = name;
	}

	public void addInstructor(String name) {
		instructors.add(new Instructor(name));
	}

	public void addStudent(String name) {
		students.add(new Student(name));
	}

	public void assignInstructorToCourse(String iName, String courseId) {
		// todo

	}

	public void createCourse(String cid, String cname) {

		// todo

	}

	public Course getCourse(String name) {
		return
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Instructor getInstructorByName(String name){
		return
	}

	public void listInstructors() {
		for (int i = 0; i < instructors.size(); i++) {
 
		}

	}

	public void listsStudents() {
	//	for (int i = 0; i < students.size(); i++) {
	//		 System.out.println(i + " : " + students.get(i).toString());  trying out something
		}

	

	public void listCourses() {
		for (int i = 0; i < courses.size(); i++) {
			 
		}

	}

}
