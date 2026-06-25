package jump2java;
import java.util.Scanner;


class Student {
	String name;
	int score;

	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void printInfo() {
		System.out.println(name + " 점수:"+ score);
	}
	public String getGrade() {
		if(score >= 90) return "A";
		else if(score >= 80) return "B";
		else if(score >= 70) return "C";
		else if(score >= 60) return "D";
		else return"F";
		
		
	 }
			
		}
		
	

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름: ");
		String name = sc.next();
		System.out.print("점수: ");
		int score = sc.nextInt();
		Student s1 = new Student (name,score);
		s1.printInfo();
		System.out.println(s1.getGrade() + "등급입니다");
		sc.close();
		
		

	}
}

