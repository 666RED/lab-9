package exercise1;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
	public void display() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.printf("Area: %.2f\n", this.getArea());
		System.out.printf("Perimeter: %.2f\n", this.getPerimeter());
		System.out.println("\n");
	}
}
