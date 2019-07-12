package hw10;

//this is the PlanetManager class i.e. Composite.  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  
public class PlanetManager implements Planet {  
  private int sceneNum;  
  private String name;  
  private float size;  

  public PlanetManager(int sceneNum,String name,float size) {  
   this.sceneNum = sceneNum;      
   this.name = name;  
   this.size = size;  
  }  
      List<Planet> planets = new ArrayList<Planet>();  
  @Override  
  public void add(Planet planet) {  
     planets.add(planet);  
  }  
     @Override  
  public Planet getChild(int i) {  
   return planets.get(i);  
  }  
  @Override  
  public void remove(Planet planet) {  
   planets.remove(planet);  
  }    
  @Override  
  public int getSceneNum()  {  
   return sceneNum;  
  }  
  @Override  
  public String getName() {  
   return name;  
  }  
 @Override  
  public float getSize() {  
   return size;  
  }  
  @Override  
  public void print() {  
   System.out.println("==========================");  
   System.out.println("Scene = "+getSceneNum());  
   System.out.println("Name = "+getName());  
   System.out.println("Size = "+getSize());  
   System.out.println("==========================");  
     
   Iterator<Planet> it = planets.iterator();  
     
       while(it.hasNext())  {  
         Planet planet = it.next();  
         planet.print();  
      }  
  }  
}// End of the PlanetManager class.  