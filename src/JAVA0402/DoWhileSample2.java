package JAVA0402;

import java.util.Scanner;

public class DoWhileSample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 부분까지 출력될 알파벳을 입력해 주세요>> ");
        char inputChar = scanner.next().charAt(0); 
        char c = 'a';

        do {
            System.out.println(c);
            c = (char) (c + 1);
        } while (c <= inputChar); 

        scanner.close(); 
    }
}
