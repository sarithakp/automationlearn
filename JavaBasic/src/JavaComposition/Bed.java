package JavaComposition;

public class Bed {
	
	private String color;
	private String size;
	private Pillow pillow;
	
	public Bed(String color, String size,Pillow pillow) {
		this.color = color;
		this.size = size;
		this.pillow = pillow;
	}
	
	public void getReadyBed() {
		System.out.println(" The bed has "+getColor()+" Size : "+getSize()+" Pillow : "+getPillow().getCount());
	
		
	}
	public String getColor() {
		System.out.println("Bed.getcolor is called ..");
		return color;
	}


	public String getSize() {
		System.out.println("Bed.getSize is called ..");
		return size;
	}


	public Pillow getPillow() {
		
		System.out.println("Bed.getpillow is called ..");
		return pillow;
	}


	
}
