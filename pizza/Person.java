package pizza;

import java.util.Date;
import java.util.List;

public abstract class Person {

	private String name;
	private String email;
	private String phoneNum;
	private String address;
	
	public Person(String newName, String newEmail, String newPhoneNum, String newAddress) {
		
		 	this.name = newName;
		    this.email = newEmail;
		    this.phoneNum = newPhoneNum;
		    this.address = newAddress;
	}
	

	public String getName() { 
		return name; 
	}
	public String getEmail() { 
		return email; 
	}
	public String getPhoneNum() { 
		return phoneNum; 
	}
	public String getAddress() {
		return address;
	}
   
   /*public String getCreditCard(){
	   
       throw new UnsupportedOperationException();

   }
   
   public String getDepartment(){
	   
       throw new UnsupportedOperationException();

   }
   
   public Date getTime(){
	   
       throw new UnsupportedOperationException();

   }
   
   public List<Person> getWorkers(){
       throw new UnsupportedOperationException();
	}
   
   public List<Person> getCustomers(){
       throw new UnsupportedOperationException();
	}
   
  // public String toString(){
	   
	 //     return ("Employee :[ Name: " + name + ", Dept: " + dept + ", Phone Number:" + phoneNum+" ]");

      // throw new UnsupportedOperationException();

  // }*/
   
}
