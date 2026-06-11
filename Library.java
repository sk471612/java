package jump2java;

abstract class Book {
	String title;
	String author;
	int price;
	boolean borrowCheck;
	
	Book (String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		borrowCheck = false;
		
	}
	
	void Info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		
			System.out.println("대출 중");         
		}
	
	void borrow() {
		if (borrowCheck) {
			System.out.println(title + "은(는) 이미 대출중입니다.");
		} else {
			borrowCheck = true;
			System.out.println(title + "대출 완료"); 
			}
		}
	abstract void bookinfo();
	
	void returnBook() {
		if (borrowCheck) {
			System.out.println("반납 가능");
			borrowCheck = false;
		} else {
			System.out.println("오류");
		}
	}
 }
	
	class Novel extends Book {
		String genre;
		Novel(String title, String author, int price, String genre) {
			super(title, author, price);
			this.genre = genre;
			borrowCheck = false;
		}
		//메서드 오버로딩
		void Info() {
			System.out.println("제목 : " + title);
			System.out.println("저자 : " + author);
			System.out.println("가격 : " + price + "원");
			System.out.println("장르 : " + genre);
			
			if (borrowCheck) {
				System.out.println("대출 중");
			} else {
				System.out.println("대출 가능");          
			}
		}
		
		void bookinfo() {
			System.out.println("장르: "+ genre);
		}
	}
	
		
	class Science extends Book {
		int level;
				
		Science(String title, String author, int price, int level) {
			super(title, author, price);
			this.level= level;
		}
		
		void bookinfo() {
			System.out.println("단계 : "+ level);
		
		}
		
 	}
	
	
public class Library {
	
	public static void main(String[] args) {
		Book[] book = new Book[2];
		book[0] = new Novel("아몬드", "사람", 20000, "소설");
		book[1]= new Science("아몬드","누군가", 20000, 3);
		
		for (int i=0; i < book.length; i++) {
			book[i].Info();
			book[i].bookinfo();
			book[i].borrow();
			book[i].returnBook();
			System.out.println("===================");
		}
		book[0].borrow();
		book[1].borrow();
	}

}
