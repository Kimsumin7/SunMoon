package MidtermExam;

import java.util.Scanner;

//Scanner를 이용한 키 연습
public class Ex2_4 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리 후 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		//문자열 읽기: next()
		String name = scanner.next();
		System.out.println("이름은" + name + ",");
		String city = scanner.next();
		System.out.println("도시는" + city + ",");
		
		//정수 읽기: nextInt()
		int age = scanner.nextInt();
		System.out.println("나이는" + age + "살,");
		
		//실수 읽기: nextDouble()
		double weight = scanner.nextDouble();
		System.out.println("체중은" + weight + "kg,");
		
		//논리값 읽기: nextBoolean()
		boolean single = scanner.nextBoolean();
		System.out.println("독신 여부는" + single + "입니다.");
		
		//scanner닫기
		scanner.close();

	}

}
