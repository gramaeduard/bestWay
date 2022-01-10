package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bestWay.object.ObjectController;
import bestWay.user.User;
import bestWay.user.UserController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class AddObject extends JFrame {

	private JPanel contentPane;
	private JTextField nume;
	private JTextField descriere;
	private JTextField price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddObject frame = new AddObject();
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
	public AddObject() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nume = new JTextField();
		nume.setBounds(108, 25, 155, 20);
		contentPane.add(nume);
		nume.setColumns(10);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(10, 28, 46, 14);
		contentPane.add(lblNume);
		
		descriere = new JTextField();
		descriere.setColumns(10);
		descriere.setBounds(108, 58, 155, 55);
		contentPane.add(descriere);
		
		JLabel lblDescriere = new JLabel("Descriere");
		lblDescriere.setBounds(10, 58, 46, 14);
		contentPane.add(lblDescriere);
		
		price = new JTextField();
		price.setBounds(108, 133, 155, 20);
		contentPane.add(price);
		price.setColumns(10);
		
		JLabel lblPret = new JLabel("Pret");
		lblPret.setBounds(10, 136, 46, 14);
		contentPane.add(lblPret);
		
		JTextArea img_text = new JTextArea();
		img_text.setBounds(444, 251, 247, 22);
		contentPane.add(img_text);
		
		JLabel img = new JLabel("");
		img.setBounds(444, 25, 247, 183);
		contentPane.add(img);
		
		JButton btnAttachimage = new JButton("Attach Image");
		btnAttachimage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f =chooser.getSelectedFile();
				String fileName = f.getAbsolutePath();
				img_text.setText(fileName);
				Image getAbsolutPath = null;
				ImageIcon icon = new ImageIcon(fileName);
				Image image = icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
				img.setIcon(icon);
				
			}
		});
		btnAttachimage.setBounds(512, 284, 113, 23);
		contentPane.add(btnAttachimage);
		
		
		JButton addbtn = new JButton("Add");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObjectController oc = new ObjectController();
				 
				String objectname = nume.getText();
				String status = "forsale";
				int userid = 1;
				String imagestring = img_text.getText();
				imagestring =imagestring.replace("\\", "\\\\");
				System.out.println("String  Imagine"+imagestring);
				
				Float pricestring =Float.parseFloat(price.getText());
				String about = descriere.getText();
				//float price =(float) 0.0;
				oc.insertObject(objectname, status, userid, imagestring,pricestring,about);
				
				
			}
		});
		addbtn.setBounds(108, 359, 89, 23);
		contentPane.add(addbtn);
	}
}
