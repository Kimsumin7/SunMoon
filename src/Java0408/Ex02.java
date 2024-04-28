package Java0408;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan;
        do {
            System.out.println("출력하고 싶은 단을 입력 (0을 입력하면 종료):");
            dan = scanner.nextInt();
            if (dan != 0) { //0입력시 종료하기 위한 용도
                gugu(dan);
            }
        } while (dan != 0); //루프 종료
        System.out.println("프로그램을 종료합니다.");
        scanner.close(); //자원 누수 방지
    }

    public static void gugu(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}
