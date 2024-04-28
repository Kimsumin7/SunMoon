package MidtermExam;

//자바 프로그램의 기본 구조
public class Ex2_1 { //클래스
	
	public static int sum(int n, int m) { //메소드
		return n + m;
	}

	public static void main(String[] args) { //메소드
		
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); //sum메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);

	}

}
