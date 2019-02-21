package hw1;

public class GifReader implements AdvancedImageReader{
@ Override
public void readGif(String fileName) {
System.out.println("Reading gif file. Name: "+ fileName);
}
@ Override
public void readBmp(String fileName) {
//do nothing
}
}


