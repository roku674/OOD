package pizza;

import java.util.ArrayList;

public class Order{
Person buyer;

//will need an add and remove
ArrayList<MenuItem> items = new ArrayList<MenuItem>();


//Add MenuItem object to items ArrayList
public void addItem(MenuItem item)
{
	items.add(item);
}

//Remove MenuItem object to items ArrayList
void removeItem(MenuItem item)
{
	//this technically removes the first item starting from the bottom revise
	items.remove(item);
}

public double getTotal(ArrayList<MenuItem> items) {
	double total = 0;
	for(MenuItem item: items) {
		total += item.getPrice();
	}
	
	return total;
}


}