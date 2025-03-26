package studio7;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width*height;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*(width+height);
		return perimeter;
	}
	public boolean isSmaller(Rectangle r2) {
		if(getArea() < r2.getArea()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isSquare() {
		if(width == height) {
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(3,2);
		
		System.out.println(r1.isSmaller(r2));
		System.out.println(r1.isSquare());

	}

}
