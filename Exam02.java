package Exam02;

public class Exam02 {

	public static void main(String[] args) {
		
		// 추상메소드
		//1. 선언되어 있으나 구현되어 있지 않은 메소드
		//2. 추상 메소드 선언
		//-> abstract 키워드로 선언.
		//ex) public abstract int getValue();
		//3. 추상메소드는 반드시 서브클래스에서 오버라이딩하여 구현.
		
		// 추상클래스
		//1. 추상메소드를 하나라도 가진 클래스
		//-> 클래스 앞에 반드시 abstract라고 선언해야 한다.
		//2. 추상메소드가 하나도 없지만 클래스 앞에 abstract로 선언한 경우도 인식한다.
		//3. 추상클래스의 객체는 생성할 수 없다.
		
		// 추상클래스의 필요성
		//1. 상속관계에서 서브클래스가 반드시 추상메소드를 구현해야 함을 알릴 때.(강제성)
		//2. 설계와 구현 분리
		//-> 슈퍼클래스에서는 개념적 특징 정의(설계도)
		//-> 서브클래스에서는 구체적 행위 구현
		
	}

}
