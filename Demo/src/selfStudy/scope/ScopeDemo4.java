package selfStudy.scope;

public class ScopeDemo4 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//for문 안에 i가 선언되었으므로 for문안에서만 유효하므로 아래의 코드는 에러를 발생시킨다.
		//System.out.println(i);
	}

}
