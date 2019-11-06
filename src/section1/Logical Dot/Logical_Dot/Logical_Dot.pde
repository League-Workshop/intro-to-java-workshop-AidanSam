

void setup() {
  size (600,600);
}

void draw() {
  fill (#9B1F1F);
  if (mousePressed) {
    fill (#FEFF00);
} else {
  fill (#A900FF);
}
ellipse (300,300,100,100);
}
