package JAVA0402;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է� �� ����");
		
		while (true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}

}
