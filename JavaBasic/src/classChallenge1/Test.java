package classChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) {
		
		Contact c1 = new Contact("abc","123");
		Contact c2 = new Contact("abc","123");
		
		
		List<Contact> list = new ArrayList<Contact>();
		
		list.add(c1);
		
		System.out.println(c1);
		System.out.println(c2);

		
		System.out.println(list.contains(c1));

		System.out.println(list.contains(c2));
		
		Contact objtocompare = c2;
		
		for (Contact con : list) {
		
			if ((con.getName() == objtocompare.getName())&& 
					(con.getPhone() == objtocompare.getPhone())) {
				System.out.println("Equal");
			}
			
		}
		

		
	}
	
}
