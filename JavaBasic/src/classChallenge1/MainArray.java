package classChallenge1;

import java.util.Scanner;

public class MainArray {
	private static Scanner scanner=new Scanner(System.in);
	private static ArrayListChallenge arrList=new ArrayListChallenge();

	public static void main(String[] args) {
		String item,newitem;
		boolean quit=false;
		while(!quit) {
		
		arrList.printInstruction();
		System.out.println("Enter your Choice: ");
		
		int choice=scanner.nextInt();
		switch(choice){
			case 1:
				arrList.printInstruction();
				break;
			case 2:
				System.out.println("Enter Item: ");
				arrList.addItem(scanner.next());
				scanner.nextLine();
				break;
			case 3:
				arrList.printList();
				break;
			case 4:
				System.out.println("Enter the item to remove: ");
				item=scanner.next();
				arrList.removeItem(item);
				break;
			case 5:
				 System.out.println("Enter Item to modify: ");
				 item=scanner.next();
				 System.out.println("Enter New Item: ");
				 newitem=scanner.next();
				 arrList.modifyList(item,newitem);
				 break;
			case 6:
				quit=true;
				break;
		}
		}

	}



	}


