package java2ump;
import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하세요. ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 1; j <= num-i+1; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}