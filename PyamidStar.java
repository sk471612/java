package jump2;
import java.util.Scanner;

public class PyamidStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이:");
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
