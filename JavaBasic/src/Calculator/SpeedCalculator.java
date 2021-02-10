package Calculator;

public class SpeedCalculator{
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour<0)
			return -1;
		else {
			
			long milesPerHour=Math.round(kilometersPerHour/1.609);
			return milesPerHour;
			
		}
	}
	
	public static void displayValues(double kilometersPerHour) {
		
		if (kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}
		else {
			
			long milesPerHour=toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour+"km/h =  "+milesPerHour+"ml/hr");
		}
		
	
	}

}
	
