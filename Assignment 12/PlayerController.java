package hw12;

public class PlayerController {
	   private Player model;
	   private PlayerViewPort view;

	   public PlayerController(Player model, PlayerViewPort view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setPlayerName(String name){
	      model.setName(name);		
	   }

	   public String getPlayerName(){
	      return model.getName();		
	   }

	   public void setPlayerRole(String role){
	      model.setPlayerRole(role);		
	   }

	   public String getPlayerRole(){
		   
	      return model.getPlayerRole();	
	   }

	   public void updateViewPort(){				
	      view.printPlayerViewPort(model.getName(), model.getPlayerRole());
	   }	
	}