package ClassChallenge;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	double answer;
	
	public void getFirstNumber() {
		
	}
	public void getSecondNumber() {
		
	}
	public void setFirstNumber(double number) {
		this.firstNumber=number;
		
	}
	public void setSecondNumber(double number) {
		this.secondNumber=number;
	}
	public double getAdditionResult() {
		
		answer=firstNumber+secondNumber;
		return answer;
		//System.out.println("The Sum of Numbers is : "+answer);
	}
	public double getSubtractionResult() {
		answer=firstNumber-secondNumber;
		return answer;
		//System.out.println("The Difference of Numbers is : "+answer);
	
	}
	public double getMultiplicationResult() {
		
		answer=firstNumber*secondNumber;
		return answer;
		//System.out.println("The product of Numbers is : "+answer);
	}
	public double getDivisionResult() {
		
		if (secondNumber!=0) {
			answer=firstNumber/secondNumber;
		}else {
			answer=0;
		}
		return answer;
		//System.out.println("The Division of Numbers is : "+answer);
	}
}
