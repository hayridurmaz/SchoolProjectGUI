package Model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

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
			System.out.println(student.toString());
		}
	}
	public void listStudents(JTextPane tf) {
		String str="";
		for (Student student : students) {
			str+=student.toString()+"\n";
		}
		tf.setText(str);
	}

	public String toString() {
		return id + " " + name;
	}

}
