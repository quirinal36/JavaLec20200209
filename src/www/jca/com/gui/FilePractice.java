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

import www.jca.com.week11.FileController;

public class FilePractice extends JFrame implements ActionListener {
	JButton insertButton;
	JButton showButton;
	JTextField textField;
	
	public FilePractice(String title) {
		int x = 200, y = 100, width = 600, height = 350;

		setTitle(title);
		setBounds(x,y,width,height);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new GridLayout(4, 1));
		getContentPane().add(panel, 0);

		insertButton = new JButton("입력");
		insertButton.addActionListener(this); 	
		panel.add(insertButton);				

		showButton = new JButton("복붙");
		showButton.addActionListener(this); 	
		panel.add(showButton);				

		textField = new JTextField();
		panel.add(textField);					
		textField.setColumns(10);				

		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		final String title = "javalec.txt";
		
		if(e.getSource() == insertButton){
			final String content = textField.getText();
			FileController control = new FileController();
			control.writeFile(title, content);
			
		}else if(e.getSource() == showButton) {
			FileController control = new FileController();
			String txt = control.readFile(title);
			
			JLabel label = new JLabel(txt);
			
			JPanel mainPanel = (JPanel)getContentPane().getComponent(0);
			mainPanel.setBackground(Color.LIGHT_GRAY);
			mainPanel.add(label);
			validate();
		}
	}

}
