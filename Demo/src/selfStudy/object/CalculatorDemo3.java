package selfStudy.object;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		//left + right
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		//(left + right) / 2
		System.out.println((this.left + this.right) / 2 );
	}
}


public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		//클래스 - 설계도, 인스턴스 - 구체적인 객체, 제품
		//객체를 만든다는것은 "사용자정의 데이터타입을 만든다" 라고도 볼 수 있다.
		//(데이터타입) (변수) (대입) (새로운) (객체 생성)
		Calculator ca1 = new Calculator();
		ca1.setOprands(10, 20);
		ca1.sum();
		ca1.avg();
		
		Calculator ca2 = new Calculator();
		ca2.setOprands(20, 40);
		ca2.sum();
		ca2.avg();
	}

}
