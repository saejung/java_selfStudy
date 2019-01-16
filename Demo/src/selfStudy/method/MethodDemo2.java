package selfStudy.method;

public class MethodDemo2 {
	
	public static void numbering(int init, int limit) {
		// 입력받은 숫자 전까지 출력하라.
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(3, 5);
	}
}

//외부의 자극이 입력이라면, 반응은 출력이라고 할 수 있다.
//우리가 아는 쓸모있는 대부분의 프로그램이 사용자의 입력에 따라서 다른 결과를 출력한다.