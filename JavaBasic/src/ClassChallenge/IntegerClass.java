package ClassChallenge;

import java.util.ArrayList;

public class IntegerClass {

	public static void main(String[] args) {
		ArrayList<Integer> newlist=new ArrayList<>();
		for(int i=0;i<10;i++) {
			newlist.add(1234+i);
		}
		
		for (int i=0;i<10;i++) {
			int num=newlist.get(i);
			if (num%2==0) {
				System.out.println(newlist.get(i));
			}
			
		}
		
		//*[@id="nav-search"]/form
		//*[@id="glow-ingress-line2"]

	}	

}
