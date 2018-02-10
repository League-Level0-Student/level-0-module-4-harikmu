//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "For this game, we'll play the start of a song, and you have to guess the rest of the lyrics.");
		// 5. Use the playSound method to play your song.
		playSound("Song.wav");
		// 6. Make a pop-up for the player to type their answer.
		String answer = JOptionPane.showInputDialog(null, "Type your answer");
		
		// 7. If they answered correctly, tell them that they were right.
		if (answer.equals("You’re fighting for your life")) {
			JOptionPane.showMessageDialog(null, "You are right");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is 'You’re fighting for your life'");
		}
		// 9. Record another sound and repeat steps 5-8.
		playSound("song2.wav");
		String answer2 = JOptionPane.showInputDialog(null, "Type your answer");
		if (answer2.equals("and it's bringing me out the dark")) {
			JOptionPane.showMessageDialog(null, "You are right");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is 'and it's bringing me out the dark'");
		}
		
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


