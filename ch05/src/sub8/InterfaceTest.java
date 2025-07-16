package sub8;

/*
 * 날짜 : 2025/07/16
 * 이름 : 손진일
 * 내용 : 인터페이스 실습하기
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 역할 1 - 통일된 표준 클래스 설계
		RemoteLG lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		lg.powerOff();
		
		RemoteSamsung samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		// 인터페이스 역할 2 - 결합도 완화(유연성)
		// 인터페이스 역할 3 - 다중 상속 효과
	}
}
