package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 1000000;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth =1000000;
		// 4. Create a variable to hold the damage the player's attack does each round
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
			String attack = JOptionPane.showInputDialog("attack with kick or yell?");
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		if(attack.equalsIgnoreCase("yell")) {
			Random rand = new Random();
			int number = rand.nextInt(1000000000);
			dragonHealth-=number;
			JOptionPane.showMessageDialog(null, "You dealt " + number + " damage!");
			JOptionPane.showMessageDialog(null, "The dragon has " + dragonHealth + " health!");
		}else {
			Random randy = new Random();
			int another = randy.nextInt(40000000);
			dragonHealth+=another;
			JOptionPane.showMessageDialog(null, "You healed the dragon " + another + " health!");
			JOptionPane.showMessageDialog(null, "The dragon has " + dragonHealth + " health!");
		}
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random roondo = new Random();
		int dattack = roondo.nextInt(40000);
		playerHealth-=dattack;
		JOptionPane.showMessageDialog(null, "The dragon dealt " + dattack + " damage!");
		// 12. Subtract this number from the player's health
		JOptionPane.showMessageDialog(null, "You have " + playerHealth + " health!");
		
		
		// 13. If the user's health is less than or equal to 0

	if (dragonHealth<=0) {
		
		
		JOptionPane.showMessageDialog(null, "You won!");
	}
		if (playerHealth<=0) {
			JOptionPane.showMessageDialog(null, "You died somehow.");
		}
		
			//-- Tell the user that they lost
	
		// 14. Else if the dragon's health is less than or equal to 0
	   //  15.  Else
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		
		}
	}

