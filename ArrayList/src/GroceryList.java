import java.util.*;

public class GroceryList {

	//we are using ArrayList because we don't know the size of our groceryList
	//List groceryList = new ArrayList();    OR
	List <String> groceryList = new ArrayList<String>();
	
	//to add item to my ArrayList
	public void addGroceryItem(String item) {
		groceryList.add(item);  
	}
	
	//to print items in my List
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1)+"."+ groceryList.get(i));
		}
	}
	
	//to modify my list, change one item with another item 
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
	}
	
	//to remove something
	public void removeGroceryItem(int position) {
		//String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	//to find item
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem); --> one method
		int position = groceryList.indexOf(searchItem);
		if (position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
}