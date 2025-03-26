package studio7;

public class Complex {
	
	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public Complex add(Complex c2) {
		double a3 = a+c2.a;
		double b3 = b+c2.b;
		Complex c3 = new Complex(a3,b3);
		return c3;
	}
	public Complex multiply(Complex c2) {
		double a3 = (a*c2.a - b*c2.b);
		double b3 = (a*c2.b + b*c2.a);
		Complex c3 = new Complex(a3,b3);
		return c3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
