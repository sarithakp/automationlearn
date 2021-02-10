package JavaComposition;

public class MainRoom {

	public static void main(String[] args) {
		Pillow pillow1=new Pillow(2);
		Bed theBed=new Bed("Red","King",pillow1);
		Table theTable=new Table("Black",10,"Wood");
		Chair theChair=new Chair(10);
		
		Room theRoom= new Room(theBed,theTable,theChair);
		theRoom.getRoomReady("ForAvani");
		theBed.getReadyBed();
		
		System.out.println("The color :"+theRoom.getBed1().getColor());
		System.out.println("the count is  .. : "+theRoom.getChair1().getChairCount());
		System.out.println("The color :"+theRoom.getTable1().getMaterial());
		System.out.println("The pillows :"+theRoom.getBed1().getPillow().getCount());
	}

}
