package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		// 3.  Use an if statement to check if their answer is correct
		String q1 = JOptionPane.showInputDialog("what number comes after 4");
		if(q1.equalsIgnoreCase("5")) {
			score+= 1;
		}else {
			score-= 1;
		}
		// 4.  if the user's answer was correct, add one to their score 
	
		String q3 = JOptionPane.showInputDialog("what color is the sky?");
		if(q3.equalsIgnoreCase("blue")) {
			score+= 1;
		}else {
			score-= 1;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		}
		JOptionPane.showMessageDialog(null, "congrats you got " + score + " out of 2 points!");
	}
	
}
