package selfStudy.scope;

public class ScopeDemo2 {
	//전역변수(global variable)
	static int i; 
	
	static void a() {
	//지역변수(local variable)
	//int i = 0;	
		i = 0;
	}
	
	public static void main(String[] args) {
		for(i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}

/*
 * 맨위에 i가 모든 메소드 밖의 class 범위에서 선언되었다
 * 때문에 모든 메소드에 영향을 주는것이고,
 * 메소드 안에서 i를 할당을 하지않고 선언을 다시한다면 해당 메소드 내에서만 유효하므로
 * 다른메소드에 영향을 주지 않는다.
 * 변수를 선언하는것은 단순히 변수를 만든다는것을 넘어서 그 변수의 유효범위를 정해주는것으로 볼 수 있다.  
 * */
