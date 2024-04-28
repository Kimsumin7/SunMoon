package Java0408;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력>");
		int dan = scanner.nextInt();  //dan이라는 변수에 입력값 받음
		gugu(dan); //gugu라는 함수 호출 후 dan이라는 인자 전달(인자:함수에 전달되는 값)
		scanner.close(); //자원 누수 방지
	
	}
	
	public static void gugu(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}

}
