public class AdapterPattern {
public static void main(String[] args) {
ImageReader imageReader = new ImageReader();
imageReader2.read("bmp", "planet1.bmp"); //this works
imageReader2.read("gif", "space.gif"); //this works
imageReader2.read("jpg", "spaceBackground.jpg"); //not supposed to work
imageReader2.read("avi", "intro.avi"); //not supposed to work
}
}
}
