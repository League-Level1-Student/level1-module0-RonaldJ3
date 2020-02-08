int rainDropY = 20;
int rdx = (int)random(601);
int score = 0;
void setup() {
  size (600, 600);
  background(200, 0, 0);
}

void draw() {
  background(100,100,100);
  fill(0, 0, 250);
  stroke(0, 0, 200);
  ellipse(rdx, rainDropY, 20, 40);
  rainDropY+=15;



  if (rainDropY-40>height) {
    fill(0, 0, 250);
    stroke(0, 0, 200);
    ellipse(rdx, rainDropY, 20, 40);
    rainDropY=20;
    checkCatch(rdx);
    rdx = (int)random(601);
  }
  fill(50, 50, 50);
  rect(mouseX, 540, 50, 60);
  fill(250, 250, 250);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x) {
  println(x +"," + mouseX);
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0)
    score--;
  println("Your score is now: " + score);
}
