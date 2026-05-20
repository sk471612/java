package jump2java;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		
		if (a > b ) {
			int temp = a;
			a=b;
			b=temp;
		}
		
		
	if (a > c) {
		int temp = a;
		a = c;
		c = temp; 
	}
		
	if (b < c) {
		int temp = b;
		b = c;
		c = temp;
	}
	System.out.println("오름차순 정렬: "+a+","+b+","+c);
}
	
		
	

}
