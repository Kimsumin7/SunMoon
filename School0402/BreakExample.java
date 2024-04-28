import java.util.Scanner;

public class BreakExample
{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력 시 종료");
		
		while (true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
		
	}
}
