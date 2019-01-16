package selfStudy.array;

public class ForeachDemo {
	
	public static void membering() {
		String[] members = { "강세정", "홍길동", "이철수" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
	}

	public static void main(String[] args) {
		membering();
	}

}

// test
