package jump2java;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		
		while(true) {
			System.out.print("2이상 정수 입력해:!!");
			num = sc.nextInt();
			
			if(num>=2) break;
		}
	boolean isPrime = false;
	
	for(int i=2; i<num; i++) {
		if(num % i== 0) {
			isPrime =false;
			break;
		}
	}
	if(isPrime) {
		System.out.println("소수이다");
	}else {
		System.out.println("소수 아니다");
	
	}
	sc.close();
	}
}

	
	

		
