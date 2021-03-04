package ClassChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylisttest {
	
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
		
			/*
			 * Form clientform=new Form("Avani","female",45455,"av@gmail"); Form
			 * clientform1=new Form("Ava","male",4545599,"av@gmail"); Form clientform2=new
			 * Form("Avi","female",4545455,"av@gmail"); Form clientform3=new
			 * Form("Aani","female",1145455,"av@gmail");
			 */
		List<Form> clientform =new ArrayList<>();
		int num=0;
		
		while(num<2) {
			System.out.println("Enter name : ");
			String name=scanner.next();
			System.out.println("Enter Gender : ");
			String gender=scanner.next();
			System.out.println("Enter Phone : ");
			long phone=scanner.nextLong();
			System.out.println("Enter Email : ");
			String email=scanner.next();
			Form f=new Form(name,gender,phone,email);
			clientform.add(f);
			num++;
			
		}
		System.out.println("The entries are..");
		
		  for(Form f:clientform) {
		  System.out.println("Name: "+f.getName()+"  Gender:  "+f.getGender()
		  +"  Phone: "+f.getPhone()+"  Email: "+f.getEmail()); }
		 
		
		
		

	}

}

 class Form{
	String name;
	String gender;
	long phone;
	String email;
	Form(String name1,String gender1,long phone1,String email1){
		this.name=name1;
		this.gender=gender1;
		this.phone=phone1;
		this.email=email1;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public long getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
}