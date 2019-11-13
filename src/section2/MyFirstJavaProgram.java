package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot notarobot = new Robot();
	notarobot.setSpeed(100);
	notarobot.penDown();
	notarobot.move(200);
	notarobot.turn(-90);
	notarobot.move(200);
	notarobot.turn(-90);
	notarobot.move(200);
	notarobot.turn(-90);
	notarobot.move(200);
	
	}
}
