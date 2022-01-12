package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import bestWay.object.ObjectController;
import bestWay.object.Object;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import java.awt.Panel;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		//contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
	
		
		/*Panel panel_1 = new Panel();
		panel_1.setBounds(10, 10, 746, 71);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Imagelbl = new JLabel("Image");
		Imagelbl.setBounds(0, 0, 89, 71);
		panel_1.add(Imagelbl);
		
		JLabel lblNewLabel_1 = new JLabel("title");
		lblNewLabel_1.setBounds(131, 11, 70, 49);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("description");
		lblNewLabel.setBounds(211, 11, 299, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("price");
		lblNewLabel_2.setBounds(668, 11, 68, 25);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(554, 24, 89, 23);
		panel_1.add(btnNewButton);*/
		
		
		//List<JPanel> panelistgeter = new ArrayList<JPanel>();
		
		
		ObjectController oc = new ObjectController();
		List<Object> objectlist = oc.getallObjects();
		//int listlenght = objectlist.size();
		//int panelsnr;
		
		
		
		
		for(Object object : objectlist) {
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 746, 71);
			//contentPane.add(panel);
			panel.setLayout(null);
			
			ImageIcon icon = new ImageIcon(object.getImage());
			JLabel imagelbl = new JLabel("Image");
			imagelbl.setBounds(0, 0, 89, 71);
			imagelbl.setIcon(icon);
			panel.add(imagelbl);
			
			JLabel titlelbl = new JLabel(object.getObjectName());
			titlelbl.setBounds(131, 11, 70, 49);
			panel.add(titlelbl);
			
			JLabel descriptionlbl = new JLabel(object.getAboutObject());
			descriptionlbl.setBounds(211, 11, 299, 49);
			panel.add(descriptionlbl);
			
			JButton addbtn = new JButton("Buy");
			addbtn.setBounds(554, 24, 89, 23);
			addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}});
			panel.add(addbtn);
			
			Float price = object.getPrice();
			JLabel pricelbl = new JLabel(price.toString());
			pricelbl.setBounds(668, 11, 68, 25);
			panel.add(pricelbl);
			
			
			
			contentPane.add(panel);
			
		}
			
		//List<JPanel> panelist = new ArrayList<JPanel>();
		
		/*if(listlenght % 3 == 0) {
		
		 panelsnr = listlenght/3;
	} else {
		 panelsnr = listlenght/3+1;
	}
	
	for(int i = 0; i < panelsnr; i++) {
		JPanel panelaux = new JPanel();
		panelaux.setLayout(new BoxLayout(panelaux, BoxLayout.LINE_AXIS));
		for(int j = 0; j < 3; j++) {
		 panelaux = panelistgeter.get(j);
		}
		contentPane.add(panelaux);
	}*/
	
		
	}
}
