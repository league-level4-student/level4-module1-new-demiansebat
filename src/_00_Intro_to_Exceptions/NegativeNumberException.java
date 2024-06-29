package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{

	
	
	static void scaryPopUp(){
		JOptionPane.showMessageDialog(null, "YOUR COMPUTER HAS A CRITICAL VIRUS!!!");
	}
	public static void testPositive(int num) throws NegativeNumberException {
		if( num<0) {
			throw new NegativeNumberException();
		}
	}
}
