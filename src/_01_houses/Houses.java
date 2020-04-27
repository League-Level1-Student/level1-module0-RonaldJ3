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
		drawHouse("large");
	}

	public void drawHouse(String height) {
		if (height.equals("small")) {
			r.move(60);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(60);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.move(100);

		}
		if (height.equals("medium")) {
			r.move(120);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(60);
			r.move(60);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.move(100);

		}
		if (height.equals("large")) {
			r.move(250);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(60);
			r.move(190);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.move(100);

		}
	}
}
