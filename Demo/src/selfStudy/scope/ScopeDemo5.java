package selfStudy.scope;

public class ScopeDemo5 {
	static int i = 5;
	
	//2
	static void a() {
		int i = 10;
		b();
	}
	
	//3
	static void b() {
		System.out.println(i);
	}
	
	//1
	public static void main(String[] args) {
		a();
	}
}

//코드의 순서가 위와 같으므로, 마지막의 3번에서 i는 전역변수인 5 의 값을 가지고 있으므로 5를 출력한다.
 