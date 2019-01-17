package selfStudy.scope;

public class ScopeDemo {
	static void a() {
		//메소드 안에서 선언한 변수는 메소드 내에서만 유효하기 때문에 그 밖에서 사용된 변수에는 영향을 주지 않는다.
		int i = 0;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
