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
		drawFlatRoof("large", "green");
		drawHouse("medium", "red");
		drawHouse("small", "blue");
		drawHouse("medium", "blue");
		drawFlatRoof("large", "green");
	}

	public void drawFlatRoof(String height, String color) {
		{	if (color.equals("Red")) {
			r.setPenColor(200, 0, 0);
		} else if (color.equals("Green")) {
			r.setPenColor(0, 200, 0);
		} else if (color.equals("blue")) {
			r.setPenColor(0, 0, 200);
		}

		if (height.equals("large")) {
			r.setPenColor(0,200,0);
			r.penDown();
			r.move(250);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(250);
			r.setPenColor(0, 120, 0);
			r.penDown();
			r.turn(-90);
			r.move(20);
			r.turn(-90);
		} else if (height.equals("small")) {
			r.penDown();
			r.move(60);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(60);
			r.setPenColor(0, 120, 0);
			r.penDown();
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.turn(-90);
		} else if (height.equals("medium")) {
			r.setPenColor(200,0,0);
			r.penDown();
			r.move(120);
			r.turn(90);
			r.move(30);
			r.turn(90);
			r.move(120);
			r.setPenColor(0, 120, 0);
			r.penDown();
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.turn(-90);
		}
		}
	}

	public void drawHouse(String height, String color) {
		if (color.equals("Red")) {
			r.setPenColor(200, 0, 0);
		} else if (color.equals("Green")) {
			r.setPenColor(0, 200, 0);
		} else if (color.equals("blue")) {
			r.setPenColor(0, 0, 200);
		}
		if (height.equals("small")) {
			r.setPenColor(0,0,200);
			r.penDown();
			r.move(60);
			r.turn(45);
			r.move(15);
			r.turn(90);
			r.move(15);
			r.turn(45);
			r.move(60);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.turn(-90);
		}
		if (color.equals("Red")) {
			r.setPenColor(200, 0, 0);
		} else if (color.equals("Green")) {
			r.setPenColor(0, 200, 0);
		} else if (color.equals("blue")) {
			r.setPenColor(0, 0, 200);
		}
		if (height.equals("medium")) {
			r.penDown();
			r.setPenColor(200, 0, 0);
			r.move(120);
			r.turn(45);
			r.move(30);
			r.turn(90);
			r.move(30);
			r.turn(45);
			r.move(120);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.penUp();
			r.turn(-90);

		}else if (height.equals("large")) {
			r.move(250);
			r.turn(90);
			r.move(15);
			r.turn(90);
			r.move(250);
			r.setPenColor(0, 120, 0);
			r.turn(-90);
			r.move(20);
			r.turn(-90);
		}
	}
}
