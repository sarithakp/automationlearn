package classChallenge1;

import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contact> myContacts;
	public MobilePhone() {
		this.myContacts=new ArrayList<Contact>();
	}
	
	public boolean existContact(Contact contact) {
		boolean check=false;
		for (Contact c1:myContacts) {
			
			if(c1.getName().equals(contact.getName()) && c1.getPhone().equals(contact.getPhone())) {
			
				check=true;
			}
			else {
				check=false;
			}
	}
		return check;
		
	}
	public void addContact(Contact con) {
		myContacts.add(con);
		
	}
	public void printContact() {
		System.out.println("Your Contacts:");
		for (Contact con:myContacts) {
			
			System.out.println("Name: "+con.getName()+"  Phone: "+con.getPhone());
		}
	}
	public boolean searchContact(String name) {
		boolean flag=false;
		for (Contact con:myContacts) {
			if(con.getName().equals(name)) {
				System.out.println("Name: "+con.getName()+"  Phone: "+con.getPhone());
				flag=true;
			}
							
		}
		return flag;
		
	}
	public void removeContact(String name) {
		try {
			
		for (Contact con:myContacts) {
			if(con.getName().equals(name)) {
				int i=myContacts.indexOf(con);
				myContacts.remove(i);
				System.out.println("Contact Removed");
			}
			
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
