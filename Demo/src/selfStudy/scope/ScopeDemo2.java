package selfStudy.scope;

public class ScopeDemo2 {
	//��������(global variable)
	static int i; 
	
	static void a() {
	//��������(local variable)
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
 * ������ i�� ��� �޼ҵ� ���� class �������� ����Ǿ���
 * ������ ��� �޼ҵ忡 ������ �ִ°��̰�,
 * �޼ҵ� �ȿ��� i�� �Ҵ��� �����ʰ� ������ �ٽ��Ѵٸ� �ش� �޼ҵ� �������� ��ȿ�ϹǷ�
 * �ٸ��޼ҵ忡 ������ ���� �ʴ´�.
 * ������ �����ϴ°��� �ܼ��� ������ ����ٴ°��� �Ѿ �� ������ ��ȿ������ �����ִ°����� �� �� �ִ�.  
 * */
