package selfStudy.scope;

public class ScopeDemo3 {
	static void a() {
		String title = "coding everybody";
	}
	
	public static void main(String[] args) {
		a();
		//title�� a() �ȿ��� ����Ȱ��̹Ƿ� main �޼ҵ忡�� ���� �� �� ����.
		//System.out.println(title);
	}

}
 