package _01_houses;
import org.jointheleague.graphical.robot.Robot;
public class Houses {
	Robot r = new Robot();
	public void run() {
	r.setSpeed(10);
	r.setPenWidth(10);
	r.setX(50);
	r.setRandomPenColor();
	r.penDown();
	drawHouse(200);
	}
	public void drawHouse(int height){
		r.move(height);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(height);
		r.move(10);
		r.setPenColor(0,120,0);
		r.turn(-90);
		r.move(20);
		r.penUp();
		r.move(100);
		
	}
}
