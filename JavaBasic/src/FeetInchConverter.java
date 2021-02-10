
public class FeetInchConverter {

	public static void main(String[] args) {
		
		double Centimeter;
		Centimeter=calcFeetAndInchesToCentimeters(-1,-5);
		System.out.println("Centimeter= "+Centimeter);
		Centimeter=calcFeetAndInchesToCentimeters(20);
		System.out.println("Centimeter= "+Centimeter);
		

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double Inches) {
		double cmvalue=-1;
		if (feet>=0) {
			if (Inches>=0 && Inches<=12) {
				cmvalue=((feet*12*2.54)+(Inches*2.54));
			}
			else
				System.out.println("Invalid Value: Inches "+Inches);
		}
		else
			System.out.println("Invalid Value: Feet : "+feet);
		return cmvalue;
	}
	public static double calcFeetAndInchesToCentimeters(double Inches) {
		double Centimeters=-1;
		if (Inches>=0) {
			if (Inches>12) {
				double feet=Math.floor(Inches/12);
				Inches=Inches%12;
				System.out.println(" Feet: "+feet+"  Inches: "+Inches);
				Centimeters=calcFeetAndInchesToCentimeters(feet,Inches);
				
			}
			else {
				Centimeters=Inches*2.54;
				
			}
		}
		return Centimeters;
	}

}
