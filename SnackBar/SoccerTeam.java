public class SoccerTeam {
	private int wins;
	private int losses; 
	private int ties; 
	
	public void played(SoccerTeam other, int myScore, int otherScore) {
		if(myScore > otherScore) {
			wins++;
			other.losses++
		}
		else if(myScore == otherScore) {
			other.ties++;
			ties++;
		}
		else {
			losses++;
			other.wins++;
			
		}
	}
	public static int currentPoints()	{
		
		
	}
	
}