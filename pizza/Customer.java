package pizza;

public class Customer extends Person {
/* Customer Object should be of type “person”
Added to Order Object
Interface that allows you to Create new Customer Objects
When Order is being created, option to select existing Customer or if new Customer is needed launch a pop up customer creator
*/
	public String creditCardInfo;
	public String[] name, email, phoneNum, address = new String[100];
	public int iterator;
	
	public Customer(String newName, String newEmail, String newPhoneNum, String newAddress, String creditCardInfo) {
		super(newName, newEmail, newPhoneNum, newAddress);
		this.creditCardInfo = creditCardInfo;
		for(int i = 0; i < name.length;) {
			if (i == iterator) {
				name[i] = newName;
				email[i] = newEmail;
				phoneNum[i] = newPhoneNum;	
				iterator++;
			}
			i++;
		}			
	}
	
	
	
  /*public Person CustomerMethod() {
 //returning customer or not
    
   //not a returning customer (new customer)
   if (Person.getName() != null)
   {
	   addCustomer();
   }
   //else they already exist
     
 return person;
 
  }*/
  
/*public Object addCustomer() {
	  
	  return customer;
  }*/

}
