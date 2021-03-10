import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
		   for(j=1;j<=n-i;j++) { 
			   System.out.printf(" ");
		   }
		   for (j=1;j<=2*i-1;j++) {
			   System.out.printf("*");
		   }
		   System.out.printf("\n");
		}
	}
}
