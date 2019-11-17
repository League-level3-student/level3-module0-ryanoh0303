package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int x= 10;
	//1. make a main method
	public static void main(String[] args) {
		Robot[] arr= new Robot[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Robot();
			arr[i].setX(x);
			arr[i].setY(500);
			arr[i].setSpeed(70);
			x+=60;
		}
		boolean racing= true;
	
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	
	    //   a random amount less than 50.
while(racing) {
	for(int i=0; i<arr.length; i++) {
		Random rand= new Random();
		arr[i].move(rand.nextInt(50));
	
		if(arr[i].getY()<=0) {
			racing=false;
			System.out.println("WINNER WINNER CHICKEN DINNER");
			System.out.println("ROBOT "+ i +" has won the race!");
		}
	}
}
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
