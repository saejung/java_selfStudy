package selfStudy.scope;

public class ScopeDemo {
	static void a() {
		//�޼ҵ� �ȿ��� ������ ������ �޼ҵ� �������� ��ȿ�ϱ� ������ �� �ۿ��� ���� �������� ������ ���� �ʴ´�.
		int i = 0;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
