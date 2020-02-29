int Xspeed =5;
int Yspeed =6;
int X = 450; 
int Y = 350;
void setup() {
  size(900, 700);
  background(0, 0, 0);
}
void draw() {
  background(random(250), random(250), random(250));
  fill(250, 250, 250);
  stroke(250, 250, 250);
  ellipse(X += Xspeed,Y += Yspeed, 25, 25);

  if (X>900) {
    Xspeed =-5;
  }
  if (X<0) {
    Xspeed = 5;
  }


  if (Y>700) {
    Yspeed =-5;
  }
  if (Y<0) {
    Yspeed = 5;
  }
}
