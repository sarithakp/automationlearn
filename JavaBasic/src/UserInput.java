import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=scanner.nextLine();
		System.out.println("Hi "+name+ " Welcome!\n");
		System.out.println("Please enter the Year of Birth");
		boolean check;
		boolean hasNextInt=scanner.hasNextInt();//this will check if the year input is an integer
		
		if (hasNextInt) {
			do {
				
				int yearOfBirth=scanner.nextInt();
				int age=2021-yearOfBirth;
				if (age>=0 && age<100) {
					System.out.println("Your Age is : "+age);
					check=true;
				}
				else
				{
					System.out.println("Invalid Year of Birth");
					check=false;
					System.out.println("Please enter the Year of Birth");
				}
			}
			while (check==false);
			
			
		}
		else {
			System.out.println("Unable to Parse Year of Birth");
		}
		

			

	}

}
