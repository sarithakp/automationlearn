package JavaComposition;

public class Table {
	
	private String color;

	private int size;
	private String material;
	
	public Table(String color, int size, String material) {
		this.color = color;
		this.size = size;
		this.material = material;
	}

	
	public String getColor() {
		System.out.println("table color is called..");
		return color;
	}

	public int getSize() {
		System.out.println("Table size is called..");
		return size;
	}

	public String getMaterial() {
		System.out.println("Table material is called ..");
		return material;
	}



}
