package Java0401;

import java.util.Scanner;

public class TG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼각형의 세 변을 입력해 주세요>>");

		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a + b <= c || b + c <= a || a + c <= b) {
			System.out.println("삼각형이 만들수없습니다.");
		}
		else {
			if (a == b && b == c)
				System.out.println("정삼각형입니다.");
			else if (a == b || b == c || c == a)
				System.out.println("이등변삼각형입니다.");
			else {
				System.out.println("일반적인 삼각형입니다.");
			}
		}
	}
}