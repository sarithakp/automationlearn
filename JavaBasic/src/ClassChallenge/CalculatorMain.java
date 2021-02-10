package ClassChallenge;

public class CalculatorMain {

	public static void main(String[] args) {
		SimpleCalculator calc=new SimpleCalculator();
		
		calc.setFirstNumber(4.786);
		calc.setSecondNumber(2.566);
		System.out.println("The Sum is :"+calc.getAdditionResult());
		System.out.println("Multiply= "+calc.getMultiplicationResult());
		System.out.println("Divide= "+calc.getDivisionResult());
		System.out.println("Subtract: "+calc.getSubtractionResult());
	}

}
