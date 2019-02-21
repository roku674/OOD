package hw1;

public class ImageReader2 implements ImageReader {
ImageAdapter imageAdapter;
@ Override
public void read(String imageType, String fileName) {

if(imageType.equalsIgnoreCase("jpg")){
System.out.println("Reading jpg file. Name: " + fileName);
}
//imageAdapter is providing support to read other file formats
else if(imageType.equalsIgnoreCase("bmp") || imageType.equalsIgnoreCase("gif")){
imageAdapter = new ImageAdapter(imageType);
imageAdapter.read(imageType, fileName);
}
else{
System.out.println("Invalid image. " + imageType + "  not supported");
}
}
}