package hw11;

public class A11Template {
	   public static void main(String[] args) {

	      Employee employee = new Programmer();
	      employee.puttinInWork();
	      System.out.println();
	      employee = new Artist();
	      employee.puttinInWork();
	      System.out.println();
	      employee = new unpaidIntern();
	      employee.puttinInWork();
	   }
	}