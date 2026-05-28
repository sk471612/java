package jump2java;
/* abstract class로 틀만 있는 클래스를 만들고 
void info() 완벽한 메서드와 abstract void 코드 짤때 꼭 들어가야하는 powerOn 메서드
부모 클래스와 자식 클래스를 메서드가 이어주는 역할
class ( 자식 클래스 )  extends ( 부모 클래스 ) = 자식클래스에 부모 클래스의 메서드를 끌어오는 명령어
밑에 void ( 메서드 ) 필수 void 뒤에는 { 필수 그다음 System.out.println(" ");
( 부모 클래스 )[] 주머니 메서드 = new ( 부모 클래스 ) [몇개 만들껀지]
부모 클래스의 값을 저장 하는 주머니 메서드
( 주머니 메서드 )[0 부터 순서] = new (자녀 클래스)();
for(int i = 0; i<ap.length; i++)
i가 0부터 시작해서 ap보다 1 적을때 까지
(주머니 메서드) [(int로 지정한 변수)].info();메서드;

*/
abstract class Appliance{
	void info() {
		System.out.println("가전제품");
	}
	abstract void powerOn();
}

class TV extends Appliance{
	void powerOn() {
		System.out.println("TV 전원 켜짐");
	}
	
}

class WashingMachin extends Appliance{
	void powerOn() {
		System.out.println("세탁기 전원 켜짐");
		
	}
}

public class T0528B {

	public static void main(String[] args) {
		Appliance[] ap = new Appliance[2];
		ap[0] = new TV();
		ap[1] = new WashingMachin();
		
		/*
		for(int i = 0; i<ap.length; i++) {
			ap[i].info();
			ap[i].powerOn();
		}
		*/
		ap[0].info();
		ap[0].powerOn();
		ap[1].info();
		ap[1].powerOn();

	}

}
