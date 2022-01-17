package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BuyPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyPage frame = new BuyPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public BuyPage(String Image, String Title, String About, Float Price ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon = new ImageIcon(Image);
		JLabel imagelbl = new JLabel("Image");
		imagelbl.setBounds(120, 11, 171, 92);
		imagelbl.setIcon(icon);
		contentPane.add(imagelbl);
		
		JLabel titlelbl = new JLabel(Title);
		titlelbl.setBounds(120, 124, 171, 24);
		contentPane.add(titlelbl);
		
		JLabel descrierelbl = new JLabel(About);
		descrierelbl.setBounds(24, 174, 282, 76);
		contentPane.add(descrierelbl);
		
		
		JLabel pretlbl = new JLabel(Price.toString());
		pretlbl.setBounds(353, 11, 71, 24);
		contentPane.add(pretlbl);
		
		JButton buybtn = new JButton("Buy");
		buybtn.setBounds(335, 227, 89, 23);
		contentPane.add(buybtn);
	}
}
