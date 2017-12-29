package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class registerExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerExam frame = new registerExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registerExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(12, 53, 765, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(206, 5, 379, 35);
		contentPane.add(panel);
		
		JButton button = new JButton("List Students");
		panel.add(button);
		
		JButton button_1 = new JButton("Register Exam Grades");
		panel.add(button_1);
		
		JButton button_2 = new JButton("List Grades");
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 53, 742, 338);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEnterExamId = new JLabel("Student:");
		lblEnterExamId.setBounds(12, 13, 84, 16);
		panel_1.add(lblEnterExamId);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(222, 65, 147, 119);
		panel_1.add(textArea);
	}
}
