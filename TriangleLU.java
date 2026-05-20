package jump2java;
import java.util.Scanner;

public class TriangleLU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하시오: ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {      // 바깥 루프
		    for(int j = i; j >= 1; j--) {    // 안쪽 루프는 j--
		        System.out.print("*");
		    }
		    System.out.println();
		
		}
		sc.close();


	}
	

}
