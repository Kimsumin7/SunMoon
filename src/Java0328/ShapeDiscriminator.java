package Java0328;

import java.util.Iterator;
import java.util.Scanner;

public class ShapeDiscriminator {

	public static void main(String[] args) {
		System.out.println("�̰��� �ﰢ���� �����ϴ� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int e1, e2, e3 = 0;
		
		for (int i = 0; i < 4; i++) {
			if (i==1) {
				System.out.println("ù��° ������ �Է��� �ּ���: ");
				int firstInteger = scanner.nextInt();
			} else if(i==2){
				System.out.println("�ι�° ������ �Է��� �ּ���: ");
				int secondInteger = scanner.nextInt();
			} else {
				System.out.println("����° ������ �Է��� �ּ���: ");
				int thirdInteger = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}

	}

}
