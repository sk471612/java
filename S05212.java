package jump2java;
import java.util.Scanner;

class Animals{
	String name;
	int age;
	
	
	Animals(String name){
		this.name = name;
	}
	
	Animals(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void sound() {
		System.out.println(this.name + "멍멍");
	}
	
	void changeName(String name) {
		this.name = name;
		System.out.println("바뀐이름: " +this.name);
	}
}

public class S05212 {
	public static void main(String[] args) {
		System.out.println("이름");
		System.out.println("나이");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Animals dog = new Animals(name, age);
		Animals cat = new Animals("야옹", 2);
		Animals dog1 = new Animals("yours");
		System.out.println(dog.name + " "+dog.age);
		System.out.println(dog1.name + " "+dog1.age);
		System.out.println(cat.name + " "+cat.age);
		dog.sound();
		cat.changeName("냐옹이");
		
	}

}
