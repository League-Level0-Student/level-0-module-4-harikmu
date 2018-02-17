

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 10; i++) {
			
		
		String z = JOptionPane.showInputDialog("Give me 1 number");
		String x = JOptionPane.showInputDialog("Give me another number");
		int n = Integer.parseInt(z);
		int a = Integer.parseInt(x);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which operation do you want to conduct?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation == 0) {
			addition(n, a);
		}
		else if (operation == 1) {
			subtraction(n, a);
		}
		else if (operation == 2) {
			multiplication(n, a);
		}
		else if (operation == 3) {
			division(n, a);
		}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
 static void addition(int n, int a) {
int s = n+a;
	 JOptionPane.showMessageDialog(null,n + "+" + a + "=" + s);
}
	// 4. Create similar methods for subtraction, multiplication and division.
 static void subtraction(int n, int a) {
int s = n-a;
	 JOptionPane.showMessageDialog(null,n + "-" + a + "=" + s);
}
 static void multiplication(int n, int a) {
int s = n*a;
	 JOptionPane.showMessageDialog(null,n + "x" + a + "=" + s);
}
 static void division(int n, int a) {
int s = n/a;
	 JOptionPane.showMessageDialog(null,n + "÷" + a + "=" + s);
}
}