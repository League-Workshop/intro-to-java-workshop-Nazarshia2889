

void setup() {
 size(600, 600); 
}

void draw() {
 if (mousePressed) {
   fill(255, 0, 0);
   ellipse(100, 100, 100, 100);
 } else {
   fill(0, 0, 255);
   ellipse(100, 100, 100, 100);
 }
}
