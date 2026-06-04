package jump2java;
import java.util.Scanner;

class Book {
	String title;
	
	Book(String title) {
		this.title = title;
	}
	void info() {
		System.out.print("책 제목: " + title);
	}
}




public class BookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목: ");
		String title = sc.next();
		Book bo = new Book(title);
		bo.info();

	}

}
