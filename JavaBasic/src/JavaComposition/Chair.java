package JavaComposition;

public class Chair {
	
	private int count;
	
	public Chair(int count) {
		this.count = count;
	}

	public int getChairCount() {
		System.out.println("Chair count is called..");
		
		return count;
	}

}
