package classChallenge1;

import java.util.Scanner;

public class MainMobile {
	public static MobilePhone mobPh=new MobilePhone();
	public static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		boolean quit=false,exist;
		while(!quit) {
			
			Choice();
			System.out.println("Enter your Choice: ");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch (choice){
			case 1:
				System.out.println("Enter Name: ");
				name=scanner.next();
				System.out.println("Enter Phone: ");
				String phone=scanner.next();
				Contact con= new Contact(name,phone);
				exist=mobPh.existContact(con);
				if (!exist) {
					mobPh.addContact(con);
					System.out.println("New Contact Added...");
					
				}else {
					System.out.println("Contact already Exist");
					
				}
				scanner.nextLine();
				break;
			case 2:
				System.out.println("Enter Contct name to Remove:  ");
				name=scanner.next();
				mobPh.removeContact(name);
				scanner.nextLine();
				break;
			case 4:
				System.out.println("Enter Contct name to search:  ");
				name=scanner.next();
				boolean flag=mobPh.searchContact(name);
				if (!flag) {
					System.out.println("Contact does not Exist");
				}
				scanner.nextLine();
				break;
			case 5:
				mobPh.printContact();
				break;
			case 6:
				quit=true;
				break;
				
			
			
			}
			
		}
		
			
		

	}
	public static void Choice() {
		System.out.println("1. Add New Contact");
		
		System.out.println("2. Remove Contact");
		System.out.println("3. Edit Contact");
		System.out.println("4. Search Contact");
		System.out.println("5. Print Contact");
		System.out.println("6. Quit");
		
	}

}
