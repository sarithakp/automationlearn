package JavaComposition;

public class Room {
	private Bed bed1;

	private Table table1;
	private Chair chair1;
	
	public Room(Bed bed1,Table table1,Chair chair1) {
	
		this.bed1 = bed1;
		this.table1=table1;
		this.chair1=chair1;
	}
	
	public void getRoomReady(String name) {
		System.out.println("The room is getting ready for .."+name);
		
		
	}
	
	public Bed getBed1() {
		return bed1;
	}

	public Table getTable1() {
		return table1;
	}

	public Chair getChair1() {
		return chair1;
	}

	

}
