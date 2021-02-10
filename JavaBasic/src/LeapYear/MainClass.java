package LeapYear;

public class MainClass {

	public static void main(String[] args) {
		
		LeapYearCalculator leap=new LeapYearCalculator();
		if(leap.isLeapYear(2007)) {
			System.out.println("Yes Leap Year");
		}
		else {
			System.out.println(" Sorry Not Leap Year");
		}
		

	}

}
