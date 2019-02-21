public class Refrigerator implements Holder {
   public String food[] = {"Chicken" , "Beef" ,"Apples" , "Oranges"};

   @Override
   public Iter getIter() {
      return new FoodIter();
   }

   private class FoodIter implements Iter {

      int a;

      @Override
      public boolean hasNext() {
      
         if(a < food.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return food[a++];
         }
         return null;
      }		
   }
}