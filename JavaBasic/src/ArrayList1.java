import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> obj1=new ArrayList<String>();
		
		obj1.add("Maths");
		obj1.add("Science");
		obj1.add("Language");
		
		int sizeOfArray = obj1.size();
		
		for (int i=0;i<sizeOfArray;i++) {
			System.out.println(obj1.get(i));
		}
		
		// Generic Array List
		
		ArrayList <String> obj2=new ArrayList<String>();
		obj2.add("Maths");
		obj2.add("Science");
		obj2.add("Language");
		
		for (String str:obj2) {
			System.out.println("The values are :"+str);
		}
		
		//Iterator
		
		ArrayList <String> obj3=new ArrayList<String>();
		obj3.add("Maths");
		obj3.add("Science");
		obj3.add("Language");
		
		Iterator<String> itr=obj3.iterator();
		
		while(itr.hasNext()) {
			String value =itr.next();
			System.out.println("The iterator value is : "+value);
			
		}
			

	}

}
