import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a: ");
		a = sc.nextDouble();
		System.out.print("Input b: ");
		b = sc.nextDouble();
		if (a==0) {
			System.out.printf("Error!");
		} else {
			double c = a/b;
			System.out.printf("Quotient of a and b: %f", c);
		}
	}
}
