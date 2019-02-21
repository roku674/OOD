package hw11;

public class Programmer extends Employee {
	
	@Override
	   void clockIn() {
	      System.out.println("Boss i'm clockin in.");
	   }
	   @Override
	   void startProject() {
	      System.out.println("Work on current scripts.");
	   }
	   @Override
	   void endProject() {
	      System.out.println("Scripts are finished. Moving onto next script.");
	   }
	   
	   @Override
	   void clockOut(){
		   System.out.println("I'm going home for today boss.");
	   }
	   
	}