package hw9;

import java.util.Iterator;

public class Refrigerator implements Holder {
   public String food[] = {"Chicken" , "Beef" ,"Apples" , "Oranges"};

   public Iterator getIter() {
      return  new FoodIter();
   }

   private class FoodIter implements Iterator {

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