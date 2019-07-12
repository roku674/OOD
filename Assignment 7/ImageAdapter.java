public class ImageAdapter implements ImageReader {
AdvancedImageReader advancedImageReader;
public ImageAdapter(String imageType){
if(imageType.equalsIgnoreCase("bmp") ){
advancedImageReader = new BmpReader();
}else if (imageType.equalsIgnoreCase("gif")){
advancedImageReader = new GifReader();
}
}
@ Override
public void read(String imageType, String fileName) {
if(imageType.equalsIgnoreCase("bmp")){
advancedImageReader.readBmp(fileName);
}
else if(imageType.equalsIgnoreCase("gif")){
advancedImageReader.readGif(fileName);
}
}
}
