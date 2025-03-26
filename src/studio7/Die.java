package studio7;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		this.sides = n;
	}
	public int roll() {
		double x = Math.random()*sides +1;
		int y = (int) x;
		return y;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die six = new Die(6);
		System.out.println(six.roll());

	}

}

