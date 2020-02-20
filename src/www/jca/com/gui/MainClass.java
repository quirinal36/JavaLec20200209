package www.jca.com.gui;

import java.awt.EventQueue;
import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		/*
		FilePractice prac = new FilePractice("");
		Index window = new Index("GUI");
		Calc calc = new Calc("계산기");
		*/
		// FilePractice test = new FilePractice("Title");
		BinaryPractice pr = new BinaryPractice();
		System.out.println(Arrays.toString(pr.decimalToBinary(15)));
		
		SumPractice sp = new SumPractice();
		System.out.println(sp.sumFor(10));
		
		FactorialPractice fp = new FactorialPractice();
		System.out.println(fp.factorial(5));
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Calc calc = new Calc("계산기");
			}
		});
		
	}
}
