package Java0327;

import java.util.Scanner;

public class MyCalculator2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수를 입력받아 계산하는 프로그램 입니다.");

		// 두 정수 및 연산자 입력 받기
		int firstInteger = getIntegerInput("첫번째 정수를 입력하세요: ", scanner);
		String operator = getOperatorInput("사용할 연산자를 골라주세요(+, -, *, /, %): ", scanner);
		int secondInteger = getIntegerInput("두번째 정수를 입력하세요: ", scanner);

		// 계산 수행
		double result = calculateResult(firstInteger, operator, secondInteger);

		// 결과 출력
		printResult(firstInteger, operator, secondInteger, result);

		scanner.close();
	}

	// 정수 입력 메소드
	public static int getIntegerInput(String message, Scanner scanner) {
		System.out.print(message);
		return scanner.nextInt();
	}

	// 연산자 입력 메소드
	public static String getOperatorInput(String message, Scanner scanner) {
		System.out.print(message);
		return scanner.next();
	}

	// 결과 계산 메소드
	public static double calculateResult(int firstInteger, String operator, int secondInteger) {
		double result = 0;

		switch (operator) {
		case "+":
			result = firstInteger + secondInteger;
			break;
		case "-":
			result = firstInteger - secondInteger;
			break;
		case "*":
			result = firstInteger * secondInteger;
			break;
		case "/":
			if (secondInteger != 0) {
				result = (double) firstInteger / secondInteger;
			} else {
				System.out.println(firstInteger + "/" + secondInteger + "으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				System.exit(1);
			}
			break;
		case "%":
			if (secondInteger != 0) {
				result = firstInteger % secondInteger;
			} else {
				System.out.println(firstInteger + "%" + secondInteger + "으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				System.exit(1);
			}
			break;
		default:
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			System.exit(1);
		}

		return result;
	}

	// 결과 출력 메소드
	public static void printResult(int firstInteger, String operator, int secondInteger, double result) {
		System.out.println("당신이 입력한 계산식은 " + firstInteger + operator + secondInteger + "입니다.");
		System.out.println("결과는 " + (int) result + "입니다. 프로그램을 종료합니다.");
	}
}