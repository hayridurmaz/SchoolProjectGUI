package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Department;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private Department department;
	private JTextField emailTextField;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Login frame = new Login();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 * }); }
	 */

	/**
	 * Create the frame.
	 */
	/*
	 * public Login(Department department) { this.department = department;
	 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setBounds(100, 100, 450,
	 * 300); contentPane = new JPanel(); contentPane.setBorder(new
	 * EmptyBorder(5, 5, 5, 5)); contentPane.setLayout(new BorderLayout(0, 0));
	 * setContentPane(contentPane); }
	 */

	public Login(Department department) {
		this.department = department;
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		emailTextField = new JTextField();
		emailTextField.setBounds(125, 99, 152, 22);
		panel.add(emailTextField);
		emailTextField.setColumns(10);
		

		JButton loginButton = new JButton("LOGIN");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (emailTextField.getText().equalsIgnoreCase("reyyan.yeniterzi@ozyegin.edu.tr")) {
					new InstructorFrame(department.getInstructorByName("Reyyan Yeniterzi")).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "User does not exist", "Error", 0);
				}
			}
		});
		loginButton.setBounds(149, 128, 97, 25);
		panel.add(loginButton);

		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setBackground(SystemColor.control);
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(78, 99, 47, 22);
		txtpnEmail.setEditable(false);
		panel.add(txtpnEmail);

	}
}
