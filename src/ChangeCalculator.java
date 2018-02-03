//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
       String n  = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
       Integer.parseInt(n);
       n = n + 5;
		// Ask the user how many dimes they have, and convert their answer
       String d  = JOptionPane.showInputDialog("How many dimes do you have?");
       Integer.parseInt(d);
       d = d + 10;
		// Ask the user how many quarters they have, and convert their answer
       String q  = JOptionPane.showInputDialog("How many quarters do you have?");
       Integer.parseInt(q);
       q = q + 25;
		// Calculate how much money the user has and save it in a double variable 
        String m = ((q + n + d));
        Integer.parseInt(m);
		// Tell the user how much money they have
        JOptionPane.showMessageDialog(null, "You have" + m + " cents");
	}
}

