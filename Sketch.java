import processing.core.PApplet;

public class Sketch extends PApplet {

  public float sunX;
  public float sunY;

  public int R = 38;
  public int G = 46;
  public int B = 117;

  public void settings() {
    // Set size of application
    size(400, 400);
  }

  public void draw() {

    background(R, G, B);

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect(-20, 375, 440, 400);

    // Stroke settings for house
    strokeWeight(0);
    fill(105, 27, 22);
    stroke(255);

    //house
    rect(100, 178, 200, 200);
    
    //Chimney
    rect(240, 100, 40, 70);

    //colour settings for roof
    fill(79, 30, 2);

    //Roof
    triangle(50, 208, 350, 208, 200, 100);

    // Stroke setting for window
    fill(145, 234, 330);

    //window
    ellipse( 200, 170, 30, 30);

    //stroke setting for sun
    fill(255, 242, 0);

    //sun
    ellipse(sunX, sunY, 100, 100);

    if (mousePressed) {

      ellipse(mouseX, mouseY, 25, 25);

    }

    if (mousePressed) {
      ellipse(mouseX, mouseY, 25, 25);
    }
    textSize(40);
    text(key, 350, 350);
    
  }

  public void keyPressed() {

    if(keyCode == LEFT){
      sunX--;
    }

    else if(keyCode == RIGHT){
      sunX++;
    }

    else if (key == ' '){

      R = 210;
      G = 222;
      B = 80;

    }

    else if (keyCode == ALT){

      R = 38;
      G = 46;
      B = 117;

    }
  }

  public void mouseWheel() {

    sunY ++;

  }


}