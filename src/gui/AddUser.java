package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bestWay.object.ObjectController;
import bestWay.user.UserController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionEvent;

public class AddUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser frame = new AddUser();
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
	public AddUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Name");
		lblNewLabel.setBounds(52, 51, 72, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 52, 192, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(52, 96, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(52, 138, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(131, 93, 192, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(131, 135, 192, 20);
		contentPane.add(passwordField_1);
		
		JButton newuserbtn = new JButton("New User");
		newuserbtn.setBounds(169, 189, 89, 23);
		contentPane.add(newuserbtn);
		newuserbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController uc = new UserController();
				 
				String objectname = textField.getText();
				String password = passwordField.getText();
				String repassword = passwordField_1.getText();;

				if(0 == password.compareTo(repassword) ) {
				uc.insertUser(objectname, password);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} 
				else {
					 JFrame  adduserpage = new JFrame();
		        	  
					 adduserpage.setBounds(100, 100, 285, 109);
					//JPanel contentPane = new JPanel();
					//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					/*contentPane = new JPanel();
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(new BorderLayout(0, 0));
					setContentPane(contentPane);
					*/
					JPanel panel = new JPanel();
					//contentPane.add(panel, BorderLayout.CENTER);
					
					JLabel lblNewLabel = new JLabel("password1 =! password 2");
					lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
					panel.add(lblNewLabel);
					
					adduserpage.add(panel);
					adduserpage.setVisible(true);
				}
				
			}
		});
		
		}

}
