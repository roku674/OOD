import java.util.Scanner;
public class BuyShare implements Command {
   private Share nameShare;

   public BuyShare(Share nameShare){
      this.nameShare = nameShare;
   }
   public void execute() {
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Input Your Name: ");
	   String name = scan.next();
	   System.out.println("");
	   System.out.print("Input Amount of shares you'd like to buy: ");
	   int quantity = scan.nextInt();
	   
	      nameShare.buy(name, quantity);
	   }
	}
