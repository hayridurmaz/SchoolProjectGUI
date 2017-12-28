package GUI;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Model.Course;
import Model.Instructor;

public class InstructorFrame extends JFrame {

	private Instructor instructor;

	public InstructorFrame(Instructor instructor) {
		this.instructor = instructor;
		init();
	}

	private void init() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane();

		// You won't use this particular code.
		// You need to modify it
		// Just use it as an example to create course tabbedpanes.
		for (Course course : instructor.getCourses()) {
			JPanel panel1 = new JPanel();
			tabbedPane.addTab(course.getId(), panel1);
		}
		/*
		 * JPanel panel1 = new JPanel(); JPanel panel2 = new JPanel();
		 * tabbedPane.addTab("Panel 1", panel1); tabbedPane.addTab("Panel 2",
		 * panel2);
		 */
		////////////////////////////////////

		this.add(tabbedPane);

		this.setVisible(true);

	}

}
