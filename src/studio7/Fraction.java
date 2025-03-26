package studio7;

public class Fraction {
	
	private double n;
	private double d;
	
	public Fraction(double n, double d) {
		this.n = n;
		this.d = d;
	}
	public Fraction add(Fraction f2) {
		double newn = n*f2.d + d*f2.n;
		double newd = d*f2.d;
		Fraction f3 = new Fraction(newn,newd);
		return f3;
	}
	public Fraction multiply(Fraction f2) {
		double newn = n*f2.n;
		double newd = d*f2.d;
		Fraction f3 = new Fraction(newn,newd);
		return f3;
	}
	public Fraction inverse() {
		Fraction f2 = new Fraction(d,n);
		return f2;
	}
	public Fraction simplify() {
		for(int i = 0; i<=d;i++) {
			
		}
		Fraction f2 = new Fraction();
		return f2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(2,4);
		Fraction f3 = f1.add(f2);
		System.out.println(f3.n);
		System.out.println(f3.d);

	}

}
