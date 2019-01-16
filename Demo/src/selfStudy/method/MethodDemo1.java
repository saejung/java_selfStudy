package selfStudy.method;

public class MethodDemo1 {
	
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	//main은 자바와 개발자 간의 약속이다.
	public static void main(String[] args) {
		//numbering()을 5번 호출
		for(int i = 0; i < 5; i++) {
			numbering();
		}
	}
}

/* 
메소드로 정의하면 호출하고자하는 횟수의 숫자만 변경하여 수정할 수 있으므로
같은 코드를 반복해서 사용하는것 보다 더욱 효율적이다.
재활용(이미 정의한 로직을 리플레이 할 수 있다.), 코드량 ↓, 유지보수유리 
*/