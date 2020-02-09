package www.jca.com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Index extends JFrame implements ActionListener{
	JButton btnNewButton;
	JTextField textField;

	public Index(String title) {
		int x = 200;
		int y = 100;
		int width = 600;
		int height = 350;

		setTitle(title);
		setBounds(x,y,width,height);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		getContentPane().add(panel);

		btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(this); 	
		panel.add(btnNewButton);				

		JLabel label = new JLabel("코딩은 재밌어");
		panel.add(label);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton){
			String textFieldInput = textField.getText();
			System.out.println("입력 : " + textFieldInput);
		}
	}

}
