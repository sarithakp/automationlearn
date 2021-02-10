package com.qa.basic;

public class MethodChallenge {
	
	
	public static void main(String[] args) {
		// method to display and calculate high position
		
		String PlayerName="Donald";
		int score;
		
		int position=calculateHighScorePosition(1000);
		displayHighScorePosition(PlayerName,position);
		
		
		position=calculateHighScorePosition(900);
		displayHighScorePosition(PlayerName,position);
		
		position=calculateHighScorePosition(400);
		displayHighScorePosition(PlayerName,position);
		
		position=calculateHighScorePosition(50);
		displayHighScorePosition(PlayerName,position);
	}
		
		public static int calculateHighScorePosition(int score) {
		/*	if (score>=1000)
				return 1;
			else if(score>=500)
				return 2;
			else if (score>=100)
				return 3;
			
			return 4;
			*/
			int position=4;
			if (score>=1000)
				position=1;
			else if (score>=500)
				position=2;
			else if (score>=100)
				position=3;
					
			return position;
			
		}
		public static void displayHighScorePosition(String name,int position) {
			
			System.out.println(name+"  Managed to get into position "+position+"  on the high score table");
		}
		

	

}
