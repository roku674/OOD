package hw10;

public interface Planet {  
    public int getSceneNum();  
    public String getName();  
    public float getSize();  
       public void print();  
    public void add(Planet planet);  
       public void remove(Planet planet);  
       public Planet getChild(int i);  
}// End of the Planet interface. 

