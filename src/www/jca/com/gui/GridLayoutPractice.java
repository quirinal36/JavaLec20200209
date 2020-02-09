package www.jca.com.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutPractice extends JFrame {
	public GridLayoutPractice(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;
		
		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel panel = new JPanel(new GridLayout(3,4));
		getContentPane().add(panel);
		
		JButton btn1= new JButton("버튼1");
		JButton btn2= new JButton("버튼2");
		JButton btn3= new JButton("버튼3");
		
		JButton btn4= new JButton("버튼4");
		JButton btn5= new JButton("버튼5");
		JButton btn6= new JButton("버튼6");
		
		JButton btn7= new JButton("버튼7");
		JButton btn8= new JButton("버튼8");
		JButton btn9= new JButton("버튼9");
		
		JButton btn10= new JButton("버튼10");
		JButton btn11= new JButton("버튼11");
		JButton btn12= new JButton("버튼12");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		panel.add(btn11);
		panel.add(btn12);
		
		setVisible(true);
	}
}
