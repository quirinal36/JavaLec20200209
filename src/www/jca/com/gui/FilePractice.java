package www.jca.com.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FilePractice extends JFrame implements ActionListener {
	JButton insertButton;
	JButton showButton;
	JTextField textField;
	
	public FilePractice(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;

		setTitle(title);
		setBounds(x,y,width,height);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new GridLayout(4, 1));
		getContentPane().add(panel, 0);

		insertButton = new JButton("입력");
		insertButton.addActionListener(this); 	
		panel.add(insertButton);				

		showButton = new JButton("보기");
		showButton.addActionListener(this); 	
		panel.add(showButton);				

		textField = new JTextField();
		panel.add(textField);					
		textField.setColumns(10);				

		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == insertButton){
			JOptionPane.showMessageDialog(this, "입력되었습니다.");
		}else if(e.getSource() == showButton) {
			JLabel label = new JLabel("출력결과");
			JPanel mainPanel = (JPanel)getContentPane().getComponent(0);
			mainPanel.setBackground(Color.RED);
			mainPanel.add(label);
			validate();
		}
	}

}
