package jump2java;
import java.util.Scanner;

public class StarPoint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 별의 갯수:");
		int num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {
			System.out.print("*");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		sc.close();
		
		
		
	}

}
