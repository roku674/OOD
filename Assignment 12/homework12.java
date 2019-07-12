package hw12;

public class homework12 {
	   public static void main(String[] args) {

	      Player model  = retreivePlayerFromDatabase();
	      PlayerViewPort view = new PlayerViewPort();

	      PlayerController controller = new PlayerController(model, view);

	      controller.updateViewPort();

	      controller.setPlayerName("Healer4Lyfe");
	      controller.setPlayerRole("Healer");
	      controller.updateViewPort();
	      
	      controller.setPlayerName("JakeFromStateFarm");
	      controller.setPlayerRole("Tank");
	      controller.updateViewPort();
	   }

	   private static Player retreivePlayerFromDatabase(){
	      Player player = new Player();
	      player.setName("xX360NoScopeMtnDewXx");
	      player.setPlayerRole("DPS");
	      return player;
	   }
	}