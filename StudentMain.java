package jump2java;
import java.util.Scanner;

class Student{
	String name;
	double score;
	
	Student(String name, double score){
		this.name = name;
		this.score = score;
	}
	
	void printInfo() {
		System.out.println(name+", "+score);
	}
	
	String getGrade() {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 정수를 입력 하시오.");
		String name = sc.next();
		double score = sc.nextDouble();
		
		Student s1 = new Student(name, score);
		s1.printInfo();
		System.out.println(s1.getGrade() + "등급 입니다.");
		

	}

}
