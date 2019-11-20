package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("HALT! Who goes there?");
	JOptionPane.showMessageDialog(null, "click ok");
	JOptionPane.showMessageDialog(null, "Thanks for pressing ok but I need you to press it again");
	JOptionPane.showMessageDialog(null, name + "! WHY DID YOU PRESS OK??");
	
	
}
}
