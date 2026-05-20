package jump2;
import java.util.Scanner;

public class TriangleRU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
