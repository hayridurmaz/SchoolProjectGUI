package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Model.Course;
import Model.GradeItem;
import Model.Instructor;
import Model.Student;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class InstructorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InstructorFrame(Instructor instructor) {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 0, 782, 553);

		// You won't use this particular code.
		// You need to modify it
		// Just use it as an example to create course tabbedpanes.
		// ArrayList<JPanel> jpanels = new ArrayList<>();
		for (Course course : instructor.getCourses()) {
			JPanel panel = new JPanel();
			panel.setLayout(null);

			JPanel panel_1 = new JPanel();
			panel_1.setBounds(12, 53, 765, 451);
			panel_1.setLayout(null);
			panel.add(panel_1);

			JPanel panel_2 = new JPanel();
			panel_2.setBounds(206, 5, 379, 35);
			panel.add(panel_2);

			JButton btnNewButton = new JButton("List Students");
			panel_2.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JTextPane textPane = new JTextPane();
					textPane.setBounds(12, 13, 741, 425);
					textPane.setOpaque(false);
					textPane.setEditable(false);
					// panel_1.add(textPane);
					panel_1.removeAll();
					// JTextPane textStudents = new JTextPane();
					// textStudents.setBounds(64, 1110, 637, 314);

					// textPane.setOpaque(false);

					course.listStudents(textPane);
					panel_1.add(textPane);
					panel_1.revalidate();
					panel_1.repaint();
				}
			});
			btnNewButton.setBounds(211, 5, 105, 25);

			JButton btnRegisterExamGrades = new JButton("Register Exam Grades");
			panel_2.add(btnRegisterExamGrades);
			btnRegisterExamGrades.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {// Register exam
															// grade birmedi!!!!
					panel_1.removeAll();

					JLabel lblEnterExamId = new JLabel("Enter exam id:");
					lblEnterExamId.setBounds(12, 13, 84, 16);
					panel_1.add(lblEnterExamId);

					JLabel labelGrade = new JLabel("Grade:");
					labelGrade.setBounds(444, 55, 84, 16);
					panel_1.add(labelGrade);

					JTextField examidtf = new JTextField();
					examidtf.setBounds(444, 13, 116, 22);
					panel_1.add(examidtf);
					examidtf.setColumns(10);

					int y1 = 60;
					ArrayList<JTextField> textFields = new ArrayList<>();
					for (Student s : course.getStudents()) {
						JLabel labelStudent = new JLabel("<html><p>" + s.toString() + "</p></html>");
						labelStudent.setBounds(12, y1, 250, 40);
						panel_1.add(labelStudent);

						JTextField studentGradeTF = new JTextField();
						studentGradeTF.setBounds(444, y1 + 20, 116, 22);
						panel_1.add(studentGradeTF);
						studentGradeTF.setColumns(10);
						y1 += 40;
						textFields.add(studentGradeTF);

					}
					JButton btnSave = new JButton("Save");
					btnSave.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							for (JTextField studentGradeTF : textFields) {
								int grade;
								if (!isNumeric(studentGradeTF.getText())) {
									JOptionPane.showMessageDialog(null, "Please enter valid grade", "Error", 0);
									return;
								}
								grade = Integer.parseInt(studentGradeTF.getText());
								if (grade > 100 || grade < 0) {
									JOptionPane.showMessageDialog(null, "Please enter valid grade", "Error", 0);
									return;
								}
								if (examidtf.getText() == null || examidtf.getText().trim().length() == 0) {
									JOptionPane.showMessageDialog(null, "Please enter an exam id", "Error", 0);
									return;
								}
								instructor.registerExamGrades(course.getId(), examidtf.getText(), grade);
							}
							JOptionPane.showMessageDialog(null, "Exam grades are added", "Added", 1);
							//System.out.println(course.getId());
							//System.out.println(examidtf.getText());
							//instructor.listGradesForExam(course.getId(), examidtf.getText());
						}
					});
					btnSave.setBounds(444, 291, 97, 25);
					panel_1.add(btnSave);

					// TODO
					panel_1.revalidate();
					panel_1.repaint();

				}
			});
			btnRegisterExamGrades.setBounds(321, 5, 159, 25);

			JButton btnListGrades = new JButton("List Grades");
			panel_2.add(btnListGrades);
			btnListGrades.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					panel_1.removeAll();

					panel_1.revalidate();
					panel_1.repaint();

				}
			});
			btnListGrades.setBounds(485, 5, 95, 25);

			tabbedPane.addTab(course.getId(), panel);
		}
		getContentPane().setLayout(null);
		////////////////////////////////////

		getContentPane().add(tabbedPane);

		this.setVisible(true);
	}

	public static boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
