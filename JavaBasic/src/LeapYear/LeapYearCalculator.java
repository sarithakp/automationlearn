package LeapYear;

public class LeapYearCalculator {
	
	public boolean isLeapYear(int year) {
		boolean leap=false;
		
		if (year%4==0){
			if (year%100==0){
				if (year%400==0){
					leap=true;
				}
				
			}
			
		}
		return leap;
		
	}

}
