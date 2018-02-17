//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	 static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String p = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 10; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(p.equals("cat")) {
				catSound();
			}
			else if(p.equals("dog")) {
				dogSound();
			}
			else if(p.equals("bird")) {
				birdSound();
			}
			else if(p.equals("fish")) {
				fishSound();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			happinessLevel++;
			if(happinessLevel == 10) {
				JOptionPane.showMessageDialog(null, "You love your pet");
			 break;
			}
			
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	

public static void catSound() {
	JOptionPane.showMessageDialog(null, "meow"
			+ "");
}
public static void dogSound() {
	JOptionPane.showMessageDialog(null, "woof");
}
public static void birdSound() {
	JOptionPane.showMessageDialog(null, "chirp");
}
public static void fishSound() {
	JOptionPane.showMessageDialog(null, "bubbles");
}

}