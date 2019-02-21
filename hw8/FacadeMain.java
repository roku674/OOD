public class FacadeMain {
   public static void main(String[] args) {
      DogBreeder dogBreeder = new DogBreeder();
      
      dogBreeder.breedDoberman();
      dogBreeder.breedGermanShepard();
      dogBreeder.breedPoodle();	
   }
}