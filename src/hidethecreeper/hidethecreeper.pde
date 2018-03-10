PImage creeper;
int creeperX = 123;
int creeperY = 455;
void setup() {
  size(1366, 706);
  PImage minecraft = loadImage("minecraft.jpg"); 
  minecraft.resize(1366, 706);     
  background(minecraft);    
  creeper=loadImage("creeper2.png");
  creeper.resize(6, 6); 
}
void draw() {
  image(creeper, creeperX, creeperY);     
  if(mousePressed && mouseX > 0 && mouseX < 75 && mouseY < 75 && mouseY > 0) {
    fill(0,255,0);
    noStroke();
    ellipse(mouseX, mouseY, 25, 25);
  }   
   else if(mousePressed && isNear(mouseX, creeperX + 3) && isNear(mouseY, creeperY + 3)) {
    fill(0,255,0);
    noStroke();
    ellipse(mouseX, mouseY, 25, 25);
    println("You found it!");
  }

  else if(mousePressed) {
    fill(255,0,0);
    noStroke();
    ellipse(mouseX, mouseY, 25, 25);
  }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}