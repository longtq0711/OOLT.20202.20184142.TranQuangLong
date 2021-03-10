import java.util.*;
public class Array {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int S = 0;
		System.out.println("Nhap so phan tu: ");
		int n = input.nextInt();
		int Arr[] = new int[n];
		System.out.println("Nhap gia tri cac phan tu: ");
		for (int i = 0; i < n; i++) {
			Arr[i] = input.nextInt();
			S += Arr[i];
		}
		double AVG = S/n;
		Arrays.sort(Arr);
		System.out.println("Day so sau khi sap xep ");
		for (int i = 0; i < n; i++) {
			System.out.print(Arr[i]+" ");
		}
		System.out.println("\nTong day so: " + S);
		System.out.println("Trung binh cong " + AVG);
	}

}
