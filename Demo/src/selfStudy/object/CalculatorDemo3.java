package selfStudy.object;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		//left + right
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		//(left + right) / 2
		System.out.println((this.left + this.right) / 2 );
	}
}


public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		//Ŭ���� - ���赵, �ν��Ͻ� - ��ü���� ��ü, ��ǰ
		//��ü�� ����ٴ°��� "��������� ������Ÿ���� �����" ��� �� �� �ִ�.
		//(������Ÿ��) (����) (����) (���ο�) (��ü ����)
		Calculator ca1 = new Calculator();
		ca1.setOprands(10, 20);
		ca1.sum();
		ca1.avg();
		
		Calculator ca2 = new Calculator();
		ca2.setOprands(20, 40);
		ca2.sum();
		ca2.avg();
	}

}
