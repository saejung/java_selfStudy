package selfStudy.method;

public class MethodDemo1 {
	
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	//main�� �ڹٿ� ������ ���� ����̴�.
	public static void main(String[] args) {
		//numbering()�� 5�� ȣ��
		for(int i = 0; i < 5; i++) {
			numbering();
		}
	}
}

/* 
�޼ҵ�� �����ϸ� ȣ���ϰ����ϴ� Ƚ���� ���ڸ� �����Ͽ� ������ �� �����Ƿ�
���� �ڵ带 �ݺ��ؼ� ����ϴ°� ���� ���� ȿ�����̴�.
��Ȱ��(�̹� ������ ������ ���÷��� �� �� �ִ�.), �ڵ差 ��, ������������ 
*/