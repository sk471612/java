package jump2java;

class Nove {
	String title;
	
	Nove(String title) {
		this.title = title;
	}
	void info() {
		System.out.print("책 제목: " + title);
	}
}

public class NovelMain {

	public static void main(String[] args) {
		Nove no = new Nove("노인과 바다");
		no.info();

	}

}
