package selfStudy.method;

public class MethodDemo2 {
	
	public static void numbering(int init, int limit) {
		// �Է¹��� ���� ������ ����϶�.
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(3, 5);
	}
}

//�ܺ��� �ڱ��� �Է��̶��, ������ ����̶�� �� �� �ִ�.
//�츮�� �ƴ� �����ִ� ��κ��� ���α׷��� ������� �Է¿� ���� �ٸ� ����� ����Ѵ�.