import java.util.Iterator;
import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		gugu(dan);
	
	}
	
	public static void gugu(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			
		}
	}
}
