package jump2java;
import java.util.Scanner;
	
class Book { 	//여기 부터
	String title;      //책제목
	String author;	   //저자
	int price;         //가격
	boolean borrowCheck; //대출 여부,true = 대출 중
	
	//생성자 수정=> 저자, 가격을 추가로 입력받아서 내부 변수 저장
	Book(String title, String author, int price){     // (클래스 이름)(String tifle = 변수){
		this.title = title; // this.입력 받은 값이 = 변수 둘이 같다
		this.author = author;
		this.price = price; 
		this.borrowCheck = false; //내부의 변수에 기본세팅
	}
	
	void info() {           // 메서드 만들기
		System.out.println("====책 제목====");
		System.out.println("책 제목: " + title);  //밑에서 (" 책 제목 " + 변수);
		System.out.println("책 저자: " + author);
		System.out.println("책 가격: " + price + "원");
		
		if(borrowCheck == true) { // if 조건문으로 트루는 대출충
			System.out.println("대출 중");
		}else {                   // 아니면 대출 가능
			System.out.println("대출가능");
		}
	}
}

class Novel extends Book{
	String genre; // 자식클래스에 변수 추가
	Novel(String title, String author, int price, String genre){
		super(title, author, price); //부모 클래스 변수를 그대로 가져옴
		this.genre = genre;
	}
	void infoGenre() { //메서드를 만들어서 장르까지 나오게
		System.out.println("장르: "+ genre);
	}
	//대출 가능
	void borrow() {
		if(borrowCheck) {
			System.out.println("대출 중 입니다");
		}else {
			System.out.println(title + "은(는) 대출 되었습니다");
			borrowCheck = true;
		}
	}
}


public class T0528C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 변수 선언
		System.out.print("책 제목: ");
		String title = sc.next();// s.next로 입력 받고 String title로 입력 받은것을 저장하는
		System.out.print("저자: ");
		String author = sc.next();
		System.out.print("가격: ");
		int price = sc.nextInt();// int 문이라서 이고 정수 입력 받는거 Int
		System.out.print("장르: ");
		String genre = sc.next();
		sc.close();
		Novel no = new Novel(title, author, price, genre); //info 메서드에 ("책 제목: + 변수)에서 변수를 지정하는 코드
		no.info();
		no.infoGenre();
		no.borrow();
		no.borrow();

	}

}
