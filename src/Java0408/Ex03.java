package Java0408;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
    	//while문으로 바꾼 것
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력하고 싶은 단을 입력>");
        int dan = scanner.nextInt();  // dan이라는 변수에 입력값 받음
        gugu(dan); // gugu라는 함수 호출 후 dan이라는 인자 전달(인자:함수에 전달되는 값)
        scanner.close(); //자원 누수 방지
    }

    public static void gugu(int dan) {
        int i = 1; //변수 i 선언 후 1이라는 초기값 할당
        while (i < 10) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
            i++;
        }
    }
}
