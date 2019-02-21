package hw9;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Assignment9 {
	
	   public static void main(String[] args) {
		   Refrigerator fridge = new Refrigerator();

	      for(java.util.Iterator iterate = fridge.getIter(); iterate.hasNext(); )
	      {
	         String name = (String)iterate.next();
	         System.out.println("Name : " + name);
	         
	      } 	
	   }
	}
