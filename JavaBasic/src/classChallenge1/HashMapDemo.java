package classChallenge1;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<String, String> profile=new HashMap<>();
		profile.put("fname", "Saritha");
		profile.put("lname", "kp");
		
		System.out.println(profile.get("fname"));

	}

}
