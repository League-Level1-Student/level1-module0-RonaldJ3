int Xspeed =5;
int Yspeed =6;
int X = 450; 
int Y = 350;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("ball.wav", 128);
  size(900, 700);
  background(0, 0, 0);
}
void draw() {
  background(0, 0, 0);
  fill(250, 250, 250);
  stroke(250, 250, 250);
  ellipse(X += Xspeed, Y += Yspeed, 25, 25);
  fill(255, 255, 255);

  if (X>900) {
    Xspeed =-5;
  }
    Xspeed = 5;
  }


  if (Y>700) {
    Yspeed =-5;
    sound.trigger();
  }
  if (Y<0) {
    Yspeed = 5;
  }
  rect(mouseX, 650, 100, 25);
  boolean intersect = intersects (X, Y, mouseX, 650, 100);
  if (intersect == true) {
    print("works");
    Yspeed = -5;
  } 
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else
    return false;
}
