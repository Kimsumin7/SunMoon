
/**
 * Main 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("=====================================");
            System.out.println("면적을 계산하고 싶은 도형을 선택하세요.");
            System.out.println("1.원(Circle)");
            System.out.println("2. 직사각형 (Rectangle)");
            System.out.println("3. 삼각형 (Triangle)");
            System.out.println("4. 종료 (Exit)");
            System.out.println("=====================================");
            System.out.print("[번호 입력]> ");

            int choice = scanner.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("원 이름을 입력하세요: ");
                    String circleName = scanner.next();
                    System.out.print("반지름을 입력하세요: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(circleName, radius);
                    break;
                case 2:
                    System.out.print("직사각형 이름을 입력하세요: ");
                    String rectangleName = scanner.next();
                    System.out.print("너비를 입력하세요: ");
                    double width = scanner.nextDouble();
                    System.out.print("높이를 입력하세요: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(rectangleName, width, height);
                    break;
                case 3:
                    System.out.print("삼각형 이름을 입력하세요: ");
                    String triangleName = scanner.next();
                    System.out.print("밑변을 입력하세요: ");
                    double base = scanner.nextDouble();
                    System.out.print("높이를 입력하세요: ");
                    double triangleHeight = scanner.nextDouble();
                    shape = new Triangle(triangleName, base, triangleHeight);
                    break;
                case 4:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }

            if (shape != null) {
                shape.draw();
                System.out.println("면적: " + shape.area());
            }

        } while (!exit);

        scanner.close();
    }
}