int rainDropY = 20;
int rN = (int) random(600 );
void setup(){
size (600,600);
background(0,0,0);





}

void draw(){
background(0,0,0);
fill(0,0,250);
stroke(0,0,200);
ellipse(200,rainDropY,20,40);
rainDropY+=5;

fill(0,0,250);
stroke(0,0,200);
ellipse(rN,rainDropY,20,40);
rainDropY+=5;

if(rainDropY>height){

rainDropY =20;

}
}
