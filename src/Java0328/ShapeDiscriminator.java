package Java0328;

import java.util.Iterator;
import java.util.Scanner;

public class ShapeDiscriminator {

	public static void main(String[] args) {
		System.out.println("이것은 삼각형을 구별하는 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int e1, e2, e3 = 0;
		
		for (int i = 0; i < 4; i++) {
			if (i==1) {
				System.out.println("첫번째 정수를 입력해 주세요: ");
				int firstInteger = scanner.nextInt();
			} else if(i==2){
				System.out.println("두번째 정수를 입력해 주세요: ");
				int secondInteger = scanner.nextInt();
			} else {
				System.out.println("세번째 정수를 입력해 주세요: ");
				int thirdInteger = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}

	}

}
