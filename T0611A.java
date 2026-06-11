package jump2java;
import java.util.Scanner;
import java.util.ArrayList;

class car {
	String name;
	int year;
	
	car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	void info() {
		System.out.println("차 이름: "+ name);
		System.out.println("연식: "+ year + "년");
	}
	
	void drive() {
		System.out.println(name + " 달립니다.");
	}
	
	int getAge() {
		return 2026-year;
	}
}

	class ElectricCar extends car {
		double battery;
		
		ElectricCar(String name, int year, double battery){
		super(name, year);
		this.battery = battery;
	}
		
		void info() {
			super.info();
			System.out.println("배터리: "+ battery+"%");
	}
		 @Override
		 void drive() {
			 System.out.println(name + " 전기로 달린다.");
	}
			int getAge() {
				return 2026-year;
	}
}
	class SportsCar extends car{
		int maxspeed;
		SportsCar(String name, int year, int maxspeed) {
			super(name,year);
		this.maxspeed = maxspeed;
		
	}
		void info() {
			super.info();
			System.out.println("최고 속도: " +maxspeed);
			
		}
		void drive() {
			System.out.println(name+ " 고속으로 달린다.");
	}
		int getAge() {
			return 2026-year;
		}
}

public class T0611A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<car> cars = new ArrayList<>();
		
		while (true) {
			System.out.println("\n=== 차량 등록 시스템===");
			System.out.println("1. 전기차 등록");
			System.out.println("2. 스포츠카 등록");
			System.out.println("3. 전기차 조회");
			System.out.println("4. 종 료 ");
			System.out.println("번호 선택: ");
			int menu = sc.nextInt();
			switch(menu) {
			
			case 1:
				System.out.println("이름,연식,배터리, 입력 하시오.");
				String name = sc.next();
				int year = sc.nextInt();
				double battery = sc.nextDouble();
				
				cars.add (new ElectricCar(name, year, battery));
				break;
				
			case 2:
				System.out.println("이름,연식,최고 속도, 입력하시오");
				String sname = sc.next();
				int syear = sc.nextInt();
				int speed = sc.nextInt();
			
				cars.add(new SportsCar(sname, syear, speed));
				break;
				
			case 3:
				if(cars.isEmpty()) {
					System.out.println("등록된 차 없음.");
					} else {
						for(car a: cars) {
							a.info();
							a.drive();
							System.out.println("나이: "+ a.getAge() + "년");
							System.out.println("======================");
						}
				}
				break;
			case 4:
				System.out.println("프로그램 종료.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력");
			}
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		car car1 = new car("차" , 2015);
		car1.info();
		car1.drive();
		System.out.println("구입한지 "+car1.getAge() + "년 된 차입니다.");
		System.out.println("=======================");
		ElectricCar car2 = new ElectricCar("전기", 2013, 55.6);
		car2.info();
		car2.drive();
		System.out.println("구입한지 "+car2.getAge() + "년 된 차입니다.");
		System.out.println("=======================");
		SportsCar car3 = new SportsCar("고오그읍차", 2025, 260);
		car3.info();
		car3.drive();
		System.out.println("구입한지 "+car3.getAge() + "년 된 차입니다.");
		*/
		
	}
}
