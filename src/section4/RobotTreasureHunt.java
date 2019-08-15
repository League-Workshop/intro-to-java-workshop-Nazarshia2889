package section4;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URI;

import javax.swing.JOptionPane;

//import org.teachingextensions.logo.ImageBackground;
//import org.teachingextensions.logo.Paintable;
//import org.teachingextensions.logo.robot;
import org.jointheleague.graphical.robot.Robot;

public class RobotTreasureHunt implements KeyEventDispatcher{

	// 1. Create a new mini robot (type "mini" inside the parentheses)
	Robot walle = new Robot("mini");
	
	private void goUp() throws InterruptedException {
		// 2. Make the robot move up the screen (use setAngle(angle) and microMove(distance))
		walle.setAngle(0);
		walle.microMove(70);
	}

	private void goDown() throws InterruptedException{
		// 3. make the robot move down the screen (use setAngle(angle) and microMove(distance))
		walle.setAngle(180);
		walle.microMove(70);
	}

	private void turnLeft() throws InterruptedException{
		// 4. Make the robot turn to the left (use setAngle(angle) and microMove(distance))
		walle.setAngle(270);
		walle.microMove(70);

	}

	private void turnRight() throws InterruptedException{
		// 5. make the robot turn to the right (use setAngle(angle) and microMove(distance))
		walle.setAngle(90);
		walle.microMove(70);
		
	}

	private void spaceBarWasPressed() {

		// 5. Change ROBOTNAME below to match the name of the robot you created in step 1.  THEN, remove the slashes at the beginning of the next two lines
		int robotXLocation = walle.getX();
		int robotYLocation = walle.getY();
		
		// 6. Print the robotXLocation and robotYLocation variables to the console 
		System.out.println(robotXLocation);
		System.out.println(robotYLocation);
		
		
		// 7. If robot is at same location as the little girl
		if(robotXLocation == 730 && robotYLocation == 440) {
			JOptionPane.showMessageDialog(null, "Go to the parrots!");
			
		}
		if(robotXLocation == 660 && robotYLocation == 160) {
			JOptionPane.showMessageDialog(null, "The robot pirate knows the answer!");
			
		}
		if(robotXLocation == 590 && robotYLocation == 370) {
			JOptionPane.showMessageDialog(null, "Beep the boy Beep");
			
		}
		if(robotXLocation == 170 && robotYLocation == 440) {
			JOptionPane.showMessageDialog(null, "In the swamp");
			
		}
		
		//      --make a pop-up tell the robot where to go next
		
		// 8. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		
		// 9.  If the robot is in the final location
		//     --call the treasureFound() method
		if(robotXLocation == 450 && robotYLocation == 510) {
			treasureFound();
			
		}
		
		
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("section4/treasure_hunt.jpg");
	
		JOptionPane.showMessageDialog(null, "Ask the girl for help with your quest. Press the space bar to ask.");

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				try {
					turnRight();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				try {
					turnLeft();
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			else if (e.getKeyCode() == 38)
				try {
					goUp();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				try {
					goDown();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}
	
	static void treasureFound() {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=G0aIg4N6aro");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main (String[] args) throws MalformedURLException {
		new RobotTreasureHunt().go();
	}
}
