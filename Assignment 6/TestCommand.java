import java.util.Scanner;

public class TestCommand {

   public static void main(String[] args) {
      Share nameShare = new Share();

      BuyShare buyShareCommand = new BuyShare(nameShare);
      SellShare sellShareCommand = new SellShare(nameShare);

      Agent agent = new Agent();
      agent.takeCommand(buyShareCommand);
      agent.takeCommand(sellShareCommand);

      agent.placeCommands();
   }
}
