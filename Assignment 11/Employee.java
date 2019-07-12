package hw11;

public abstract class Employee {
	   abstract void clockIn();
	   abstract void startProject();
	   abstract void endProject();
	   abstract void clockOut();

	   //template method
	   public final void puttinInWork(){
		   //put em in the dirt

	      //initialize the game
	      clockIn();

	      //start game
	      startProject();

	      //end game
	      endProject();
	      
	      clockOut();
	   }
	}