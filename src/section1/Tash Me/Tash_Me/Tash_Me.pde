PImage mustache;
PImage friend;
void setup() {
  friend = loadImage("face.png");
  size(800, 600);
  friend.resize(width,height);
    mustache = loadImage("mustache.png");
    mustache.resize(600,400);
}

void draw() {
  background(friend);
  image(mustache, mouseX-100, mouseY+100);
}
