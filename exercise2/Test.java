package exercise2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, d, e, f;
		
		System.out.print("Enter the value of a: ");
		a = scanner.nextDouble();
		
		System.out.print("Enter the value of b: ");
		b = scanner.nextDouble();
		
		System.out.print("Enter the value of c: ");
		c = scanner.nextDouble();
		
		System.out.print("Enter the value of d: ");
		d = scanner.nextDouble();
		
		System.out.print("Enter the value of e: ");
		e = scanner.nextDouble();
		
		System.out.print("Enter the value of f: ");
		f = scanner.nextDouble();
		
		LinearEquation Eq1 = new LinearEquation(a, b, c, d, e, f);
		
		if(Eq1.isSolvable()) {
			System.out.println("\nThe equation has solution");
		}else {
			System.out.println("\nThe equation has no solution");
		}
		
		System.out.println("The value of x: " + Eq1.getX());
		
		System.out.println("The value of y: " + Eq1.getY());
	}

}
