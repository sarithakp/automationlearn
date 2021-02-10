package classChallenge1;

import java.util.ArrayList;

public class ArrayListChallenge {
	
	
	private ArrayList<String> grocery=new ArrayList<String>();
	
	public void addItem(String item) {
		grocery.add(item);
		
	}
	public void printList() {
		for (int i=0;i<grocery.size();i++) {
			System.out.println(i+1+". "+grocery.get(i));
		}
	}
	public void removeItem(String item) {
		int position=grocery.indexOf(item);
		if (grocery.contains(item)) {
			grocery.remove(position);
			System.out.println("Removed Item : "+item);
		}
		else {
			System.out.println("Item not Found in List");
		}
		
	}
	
	public void printInstruction() {
		System.out.println("\n1. PrintInstruction");
		System.out.println("2. Add Item");
		System.out.println("3. Print List");
		System.out.println("4. Remove Item");
		System.out.println("5. Modify Item");
		System.out.println("6. Quit");
	}
	
	  public void modifyList(String item,String newItem) {
		  int position=grocery.indexOf(item);
		  if (grocery.contains(item)) {
			  grocery.set(position, newItem);
			  System.out.println("Item modified: "+newItem);
		  }
		  
		  else {
			  System.out.println("Item not found in List ");
			  this.addItem(newItem);
			  System.out.println("New Item Added: "+newItem);
		  }
		  
	  
	  
	  }
	 
}
