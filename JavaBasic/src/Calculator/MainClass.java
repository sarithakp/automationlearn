package Calculator;

public class MainClass {
	
	

	public static void main(String[] args) {
		
		long speed;
		double kph=188.5;
		SpeedCalculator SC=new SpeedCalculator();
		//speed=SC.toMilesPerHour(kph);
		SC.displayValues(kph);
		

	}

}
