/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240507)
 */
import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
 
    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("width>> ");
        rect.width = scanner.nextInt();
        System.out.print("height>> ");
        rect.height = scanner.nextInt();
        
        System.out.println("사각형의 면적은>> " + rect.getArea());
        scanner.close();
    }
}
