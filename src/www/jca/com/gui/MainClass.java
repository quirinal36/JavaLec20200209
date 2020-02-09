package www.jca.com.gui;

import java.awt.EventQueue;

public class MainClass {
	public static void main(String[] args) {
		/*
		FilePractice prac = new FilePractice("");
		Index window = new Index("GUI");
		Calc calc = new Calc("계산기");
		*/
		// FilePractice test = new FilePractice("Title");
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Calc calc = new Calc("계산기");
			}
		});
		
	}
}
