int rainDropY = 20;
int rdx = (int)random(601);
int score = 0;
void setup() {
  size (600, 600);
  background(0, 0, 0);
}

void draw() {
  background(0, 0, 0);
  fill(0, 0, 250);
  stroke(0, 0, 200);
  ellipse(rdx, rainDropY, 20, 40);
  rainDropY+=5;



  if (rainDropY-40>height) {
    fill(0, 0, 250);
    stroke(0, 0, 200);
    ellipse(rdx, rainDropY, 20, 40);
    rainDropY+=5;
    rainDropY=20;
    rdx = (int)random(601);
    checkCatch();
}

  rect(mouseX,540,50,60);
      fill(250,250,250);
textSize(16);
text("Score: " + score, 20, 20);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0)
          score--;
     println("Your score is now: " + score);
   }
