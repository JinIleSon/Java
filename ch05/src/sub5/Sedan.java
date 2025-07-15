package sub5;

public class Sedan extends Car {

	private int cc; // 배기량
	
	// 상수(Constant) - 최초 한 번 초기화된 값으로 고정된 변수
	private final int MAX_SPEED = 180; // 변하지 않는 상수(final)
	
	public Sedan(String name, String color, int speed, int cc) {
		// 부모클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화해줘야 됨
		super(name, color, speed); //부모 클래스를 불러오는 거 자체만으로 필드를 초기화
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		// 부모클래스 speedUp을 자식클래스에 맞게 재정의
		this.speed += speed;
		
		if(this.speed > MAX_SPEED) {
			this.speed = MAX_SPEED; // 속도 제한걸기(180)
		}
	}
	
	public void turbo() {
		// 부모 클래스 speed 참조를 위해 접근권한을 private에서 protected로 변경
		this.speed += 10;
	}
	
	public void show() {
		super.show(); // 부모클래스 show() 호출
		System.out.println("배기량 : " + cc);
	}
	
}
