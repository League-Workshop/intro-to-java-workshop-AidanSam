package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		JOptionPane.showMessageDialog(null, "spell the following words");
		speak("repository");
		String repositry = JOptionPane.showInputDialog("type it in");
		if(repositry.equalsIgnoreCase("repository")) {
			speak("good job");
			
		} else {
			speak("you do not know how to spell repository");
		}
		JOptionPane.showMessageDialog(null, "spell the following words");
		speak("Hippopotomonstrosesquippedaliophobia");
		String longword = JOptionPane.showInputDialog("type it in");
		if(longword.equalsIgnoreCase("Hippopotomonstrosesquippedaliophobia")) {
			speak("good job");
			
		} else {
			speak("you do not know how to spell Hippopotomonstrosesquippedaliophobia");
		}
		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


