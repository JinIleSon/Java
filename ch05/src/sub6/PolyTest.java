package sub6;

/*
 * 날짜 : 2025/07/15
 * 이름 : 손진일
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *   - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *   - 객체 생성할 때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 *   - 다형성을 통하여 프로그래밍의 중복코드를 줄이고 유연성을 향상
 */

public class PolyTest {
	public static void main(String[] args) {
		
		
		
		// 다형성 - 자식 객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();

		System.out.println();
		
		// 다운캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(Casting, 형변환)
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		// 다형성을 활용한 객체 배열
		Animal arr[] = {t, e, s};
		
		System.out.println();
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
		///////////////////////////////
		///
		Dog dog = new Dog();
		Cat cat = new Cat();
		printSound(dog);
		printSound(cat);
		
	}
	public static void printSound( Pet pet ) {
		pet.makeSound();

	}

}
