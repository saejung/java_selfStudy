package selfStudy.scope;

public class ScopeDemo3 {
	static void a() {
		String title = "coding everybody";
	}
	
	public static void main(String[] args) {
		a();
		//title은 a() 안에서 선언된것이므로 main 메소드에서 접근 할 수 없다.
		//System.out.println(title);
	}

}
 