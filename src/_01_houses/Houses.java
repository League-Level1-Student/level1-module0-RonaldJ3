package _01_houses;
import org.jointheleague.graphical.robot.Robot;
public class Houses {
	public void run() {
	Robot r = new Robot();
	r.setSpeed(10);
	r.setPenWidth(10);
	r.setX(50);
	r.setRandomPenColor();
	r.penDown();
	r.move(100);
	r.turn(90);
	r.move(30);
	r.turn(90);
	r.move(100);
	r.move(10);
	r.setPenColor(0,120,0);
	r.turn(-90);
	r.move(20);
	r.penUp();
	r.move(100);
	}
	void
}
