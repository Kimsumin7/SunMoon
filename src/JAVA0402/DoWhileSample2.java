package JAVA0402;

import java.util.Scanner;

public class DoWhileSample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���ϴ� �κб��� ��µ� ���ĺ��� �Է��� �ּ���>> ");
        char inputChar = scanner.next().charAt(0); 
        char c = 'a';

        do {
            System.out.println(c);
            c = (char) (c + 1);
        } while (c <= inputChar); 

        scanner.close(); 
    }
}
