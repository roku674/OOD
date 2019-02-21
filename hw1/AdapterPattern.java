package hw1;

public class AdapterPattern {
public static void main(String[] args) {
ImageReader imageReader;
ImageReader imageReader2 = new ImageReader2();
imageReader2.read("bmp", "planet1.bmp"); //this works
imageReader2.read("gif", "space.gif"); //this works
imageReader2.read("jpg", "spaceBackground.jpg"); //this works
imageReader2.read("avi", "intro.avi"); //not supposed to work
}
}

