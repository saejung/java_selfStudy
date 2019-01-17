package selfStudy.object;

class Calculator2{
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		//left + right
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		//(left + right) / 2
		System.out.println((this.left + this.right) / 2 );
	}
}


public class CalculatorDemo4 {
	
	public static void main(String[] args) {
		//��ü - ���� + �޼ҵ�
		//Ŭ���� - ���赵, �ν��Ͻ� - ��ü���� ��ü, ��ǰ
		//��ü�� ����ٴ°��� "��������� ������Ÿ���� �����" ��� �� �� �ִ�.
		//(������Ÿ��) (����) (����) (���ο�) (��ü ����)
		Calculator2 ca1 = new Calculator2();
		ca1.setOprands(10, 20);
		ca1.sum();
		
		Calculator2 ca2 = new Calculator2();
		ca2.setOprands(20, 40);
		ca2.sum();
		
		// Ŭ���� ���� base�� ���� 20���� �����ߴ�.
		Calculator2.base = 20;
		ca1.sum();
		ca2.sum();
		
		System.out.println(ca1.PI);
		System.out.println(ca2.PI);
		System.out.println(Calculator2.PI);
	}
	/* Ŭ���� ������ �뵵
	 * �ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ��� (���� �������� PI)
	 * (�̷� ��� final�� �̿��ؼ� ����� �����ϴ� ���� �ٶ��� ������ final�� ���� ����� �ʾұ� ������ ������� �ʾҴ�)
	 * �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���
	 * ���� ��������� ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
	 * */
}
