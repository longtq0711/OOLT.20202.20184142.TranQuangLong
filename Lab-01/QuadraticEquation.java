import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[] args) {
		double a,b,c,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a: ");
		a = sc.nextDouble();
		System.out.print("Input b: ");
		b = sc.nextDouble();
		System.out.print("Input c: ");
		c = sc.nextDouble();
		double del = b*b - 4*a*c;
		if(del == 0) {
			x = -b/2*a;
			System.out.printf("Equation has double root: x=%f", x);
		} else if(del > 0) {
			double x1 = (-b + Math.sqrt(del))/(2*a);
			double x2 = (-b - Math.sqrt(del))/(2*a);
			System.out.printf("Equation has 2 distinct roots: x1=%f", x1 + "and x2=%f",x2);
		} else System.out.printf("Equation has no solution");

	}

}
