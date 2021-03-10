import java.util.*;
public class AddTwoMatrices {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao kich thuoc ma tran:");
		int numLine = input.nextInt();
		int numCol = input.nextInt();
		int A1[][] = new int[numLine][numCol];
		int A2[][] = new int[numLine][numCol];
		int B[][] = new int[numLine][numCol];
		
		for(int i = 0; i < numLine; i++) 
			for (int j = 0; j< numCol; j++) {
				System.out.printf("A1[" + i + "][" + j +"] = ");
				A1[i][j] = input.nextInt();
			}
		System.out.println();
		for(int i = 0; i < numLine; i++) 
			for (int j = 0; j< numCol; j++) {
				System.out.printf("A2[" + i + "][" + j +"] = ");
				A2[i][j] = input.nextInt();
			}
		System.out.println("Ma tran A1 + A2: ");
		for(int i = 0; i < numLine; i++) {
			
		
			for (int j = 0; j< numCol; j++) {
				B[i][j] = A1[i][j] + A2[i][j];
				System.out.printf(B[i][j]+" ");
			}
			System.out.println();
		}
	}

}
