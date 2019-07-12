package hw11;

public class unpaidIntern extends Employee {
	
	@Override
	   void clockIn() {
	      System.out.println("Boss i'm clockin in.");
	   }
	   @Override
	   void startProject() {
	      System.out.println("I'm making copies and getting your covfefe");
	   }
	   @Override
	   void endProject() {
	      System.out.println("what's next?");
	   }
	   
	   @Override
	   void clockOut(){
		   System.out.println("I'm going home for today [insert gender pronoun]");
	   }
	   
	}