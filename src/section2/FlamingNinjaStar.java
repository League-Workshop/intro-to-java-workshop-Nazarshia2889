package section2;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
		Robot walle = new Robot();
		walle.penDown();

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 100
		walle.setSpeed(100);

		// 13. Use a for loop to repeat all of the code below 25 times

			// 2. Turn the robot 1/8 of a circle
		for(int i=0;i<25;i++) {
		walle.turn(360/8);
		
			// 3. Move the robot 64 pixel
		walle.move(64);

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		walle.turn(-40);
			
			// 5. Move the robot the distance in the variable flameSize
		walle.setPenColor(Color.yellow);
		walle.move(flameSize);
		
			
			// 6. Turn the robot 170 degrees
		walle.turn(170);
			
			// 7. Move the robot the distance in the variable flameSize (again)
		walle.move(flameSize);
		walle.setPenColor(Color.black);
			
			// 8. Turn the robot 64 degrees to the right
		walle.turn(64);
			
			// 9. Move the robot the distance in the variable baseSize
		walle.move(baseSize);
		
		
		
		}
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}


