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

//�ڵ��� ������ ���� �����Ƿ�, �������� 3������ i�� ���������� 5 �� ���� ������ �����Ƿ� 5�� ����Ѵ�.
 