public class Assignment9 {
	
   public static void main(String[] args) {
      Refrigerator fridge = new Refrigerator();

      for(Iter iter = Refrigerator.getIter(); iter.hasNext();){
         String food = (String)iter.next();
         System.out.println("Food in the refrigerator : " + food);
      } 	
   }
}
