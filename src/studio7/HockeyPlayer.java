package studio7;

public class HockeyPlayer {
	
	private String name;
	private int number;
	private int goals;
	private int assists;
	private int points;
	
	public HockeyPlayer(String name, int n, int g, int a) {
		this.name = name;
		this.number = n;
		this.goals = g;
		this.assists = a;
		this.points = g+a;
	}
	public HockeyPlayer game(int g, int a) {
		goals = goals+g;
		assists = assists + a;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HockeyPlayer bill = new HockeyPlayer("bill",10,10,15);
		bill.game(4, 5);
		System.out.println(bill.assists);

	}

}
