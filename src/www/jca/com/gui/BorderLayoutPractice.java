package www.jca.com.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutPractice extends JFrame {
	public BorderLayoutPractice(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;
		
		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel panel = new JPanel(new BorderLayout());
		getContentPane().add(panel);
		
		JButton btnNorth = new JButton("North"); 
		JButton btnWest = new JButton("West");
		JButton btnCenter = new JButton("Center");
		JButton btnEast = new JButton("East");
		JButton btnSouth = new JButton("South");
		
		panel.add(btnNorth, BorderLayout.NORTH);
		panel.add(btnWest, BorderLayout.WEST);
		panel.add(btnCenter, BorderLayout.CENTER);
		panel.add(btnEast, BorderLayout.EAST);
		panel.add(btnSouth, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
