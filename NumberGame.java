package jump2java;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(90)+10;
		int user;
		int count = 0;
		
		System.out.println("2자리 숫자 맞추기 게임을 시작합니다.");
		
		while(true) {
			System.out.println("2자리 자연수 입력하세요.");
			user = sc.nextInt();
			count++;
			
			if(user > answer) {
				System.out.println("더 작은수");
				}else if(user < answer) {
					System.out.println("더 큰 수");
				} else {
					System.out.println("정답");
					System.out.println("시도 횟수: "+count+"번");
					break;
				}
		}
		sc.close();
		
		

	}

}
