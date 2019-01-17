package selfStudy.object;

class Calculator2{
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		//left + right
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		//(left + right) / 2
		System.out.println((this.left + this.right) / 2 );
	}
}


public class CalculatorDemo4 {
	
	public static void main(String[] args) {
		//객체 - 변수 + 메소드
		//클래스 - 설계도, 인스턴스 - 구체적인 객체, 제품
		//객체를 만든다는것은 "사용자정의 데이터타입을 만든다" 라고도 볼 수 있다.
		//(데이터타입) (변수) (대입) (새로운) (객체 생성)
		Calculator2 ca1 = new Calculator2();
		ca1.setOprands(10, 20);
		ca1.sum();
		
		Calculator2 ca2 = new Calculator2();
		ca2.setOprands(20, 40);
		ca2.sum();
		
		// 클래스 변수 base의 값을 20으로 지정했다.
		Calculator2.base = 20;
		ca1.sum();
		ca2.sum();
		
		System.out.println(ca1.PI);
		System.out.println(ca2.PI);
		System.out.println(Calculator2.PI);
	}
	/* 클래스 변수의 용도
	 * 인스턴스에 따라서 변하지 않는 값이 필요한 경우 (위의 예에서는 PI)
	 * (이런 경우 final을 이용해서 상수로 선언하는 것이 바람직 하지만 final을 아직 배우지 않았기 때문에 언급하지 않았다)
	 * 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
	 * 값의 변경사항을 모든 인스턴스가 공유해야 하는 경우
	 * */
}
