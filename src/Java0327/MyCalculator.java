package Java0327;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수를 입력받아 계산하는 프로그램 입니다.");

        // 첫번째 정수 입력
        System.out.print("첫번째 정수를 입력하세요: ");
        int firstInteger = scanner.nextInt();

        // 사용할 연산자 입력
        System.out.print("사용할 연산자를 골라주세요(+, -, *, /, %): ");
        String operator = scanner.next();

        // 두번째 정수 입력
        System.out.print("두번째 정수를 입력하세요: ");
        int secondInteger = scanner.nextInt();

        // 결과를 저장할 변수
        double result = 0;

        // 학번 홀수 switch
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
                if (firstInteger == 0 || secondInteger == 0) {
                    System.out.println(firstInteger + "/" + secondInteger + "으로 나눌 수 없습니다. 프로그램을 종료합니다.");
                    return;
                }
                result = (double)firstInteger / secondInteger;
                break;

            case "%":
                if (firstInteger == 0 || secondInteger == 0) {
                    System.out.println(firstInteger + "%" + secondInteger + "으로 나눌 수 없습니다. 프로그램을 종료합니다.");
                    return;
                }
                result = firstInteger % secondInteger;
                break;

            default:
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                return;
        }

        // 결과 출력
        int roundedResult = (int)result;
        System.out.println("당신이 입력한 계산식은 " + firstInteger + operator + secondInteger + "입니다.");
        System.out.println("결과는 " + roundedResult + "입니다. 프로그램을 종료합니다.");
    }
}
