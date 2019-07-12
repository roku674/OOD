public class DogBreeder {
   private Dog doberman;
   private Dog germanShepard;
   private Dog poodle;

   public DogBreeder() {
      doberman = new Doberman();
      germanShepard = new GermanShepard();
      poodle = new Poodle();
   }

   public void breedDoberman(){
      doberman.breed();
   }
   public void breedGermanShepard(){
      germanShepard.breed();
   }
   public void breedPoodle(){
      poodle.breed();
   }
}