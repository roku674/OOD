package hw11;

public class Artist extends Employee {
	
	@Override
	   void clockIn() {
	      System.out.println("Boss i'm clockin in.");
	   }
	   @Override
	   void startProject() {
	      System.out.println("Work on current design project.");
	   }
	   @Override
	   void endProject() {
	      System.out.println("Art project is finished. moving onto next project.");
	   }
	   
	   @Override
	   void clockOut(){
		   System.out.println("I'm goin home for today boss.");
	   }
	   
	}