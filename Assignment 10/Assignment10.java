package hw10;

public class Assignment10 {  
    public static void main(String args[]){  
         Planet planet1 = new SupportsLife(1,"Delta Omicron 1", 20000);  
         Planet planet2 = new SupportsLife(2,"Delta Omicron 2", 25000);  
         Planet planet3 = new Lifeless(3,"Delta Omicron 3", 30000);   
         Planet manage = new PlanetManager(4,"Delta Omicron 4",100000);  
            
          manage.add(planet1);  
          manage.add(planet2);  
          manage.add(planet3);  
          manage.print();  
        }  
}  