package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import bestWay.user.UserController;

public class Authentication extends JFrame{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JButton addnewuser;
	//private static  
	
	public Authentication() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserController cn = new UserController();
				String username = userText.getText();
				String password = passwordText.getText();
				
		          if(cn.isvalid(username, password)) {
		        	  
		        	  //dispose();
		        	  //frame.
		        	  HomePage hpage = new HomePage();
		        	  hpage.setVisible(true);
		        	  frame.setVisible(false);
		        	  }
		              else{
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
						
						JLabel lblNewLabel = new JLabel("User or Password is incorect!");
						lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
						panel.add(lblNewLabel);
						
						adduserpage.add(panel);
						adduserpage.setVisible(true);
						adduserpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          }
				
			}});
		
		panel.add(button);
		
		
		addnewuser = new JButton("New User");
		addnewuser.setBounds(100, 80, 125, 25);
		addnewuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		        	  AddUser adduserpage = new AddUser();
		        	  adduserpage.setVisible(true);
		        	  adduserpage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        	  //frame.setVisible(false); }
				
			}});
		panel.add(addnewuser);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentication frame = new Authentication();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*@Override
	/*public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UserController cn = new UserController();
		String username = userText.getText();
		String password = passwordText.getText();
          if(cn.isvalid(username, password)) {
        	  
        	  //dispose();
        	  //frame.
        	  HomePage hpage = new HomePage();
        	  hpage.setVisible(true);;
        	  frame.setVisible(false);
          }
	}-*/
}
