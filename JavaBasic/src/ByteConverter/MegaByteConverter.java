package ByteConverter;

public class MegaByteConverter {
	
	public void printMegaBytesandKiloBytes(int kiloBytes) {
		
		 if (kiloBytes<0){
	         System.out.println("Invalid Value");
	         
	     }
	     else{
	         int megaBytes=calculateMegaBytes(kiloBytes);
	         int kb=kiloBytes%1024;
	         System.out.println(kiloBytes+" KB = "+megaBytes+"MB and "+kb+"KB");
	     }
	     
	     
	 }
	 public int calculateMegaBytes(int kiloBytes){
	     
	     return kiloBytes/1024;
	     
	   
	 }
	 
	

}
