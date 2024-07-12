
/**
 * Main 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        DecimalFormat df = new DecimalFormat("0.00");
        Shape[] shapes = new Shape[10]; // 최대 10개의 도형을 저장할 수 있는 배열
        int shapeCount = 0; // 저장된 도형 개수를 기록

        do {
            System.out.println("================================");
            System.out.println("도형을 선택하세요:");
            System.out.println("1.원(Circle)");
            System.out.println("2.직사각형(Rectangle)");
            System.out.println("3.삼각형(Triangle)");
            System.out.println("4.도형 목록 보기");
            System.out.println("5.도형 삭제");
            System.out.println("6.종료");
            System.out.println("================================");
            System.out.print("[번호 입력]> ");
            
            int choice = -1;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                System.out.println();
                scanner.next(); // 잘못된 입력 버리기
                continue;
            }

            Shape shape = null;

            switch (choice) {
                case 1:

                    try {
                        System.out.print("원 이름을 입력하세요: ");
                        String circleName = scanner.next();
                        System.out.print("색상을 입력하세요: ");
                        String circleColor = scanner.next();
                        System.out.print("반지름을 입력하세요: ");
                        double radius;
                        if (scanner.hasNextDouble()) {
                            radius = scanner.nextDouble();
                        } else {
                            // double 형식으로 변환할 수 없는 경우에는 int로 시도
                            int intRadius = scanner.nextInt();
                            radius = (double) intRadius;
                        }
                        if (radius <= 0) {
                            System.out.println("반지름은 0보다 커야 합니다.");
                        } else {
                            shape = new Circle(circleName, circleColor, radius);
                            shapes[shapeCount++] = shape; // 배열에 도형 추가 후 카운트 증가
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                        System.out.println();
                        scanner.next(); // 잘못된 입력 버리기
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.print("직사각형 이름을 입력하세요: ");
                        String rectangleName = scanner.next();
                        System.out.print("색상을 입력하세요: ");
                        String rectangleColor = scanner.next();
                        System.out.print("너비를 입력하세요: ");
                        double width = scanner.nextDouble();
                        System.out.print("높이를 입력하세요: ");
                        double height = scanner.nextDouble();
                        if (width <= 0 || height <= 0) {
                            System.out.println("너비와 높이는 0보다 커야 합니다.");
                        } else {
                            shape = new Rectangle(rectangleName, rectangleColor, width, height);
                            shapes[shapeCount++] = shape; // 배열에 도형 추가 후 카운트 증가
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                        System.out.println();
                        scanner.next(); // 잘못된 입력 버리기
                    }
                    break;
                    
                case 3:
                try {
                    // 삼각형 정보 입력 받기
                    System.out.print("삼각형 이름을 입력하세요: ");
                    String triangleName = scanner.next();
                    System.out.print("색상을 입력하세요: ");
                    String triangleColor = scanner.next();
                    System.out.print("첫 번째 변의 길이를 입력하세요: ");
                    double side1;
                    if (scanner.hasNextDouble()) {
                        side1 = scanner.nextDouble();
                    } else {
                        // double 형식으로 변환할 수 없는 경우에는 int로 시도
                        int intSide1 = scanner.nextInt();
                        side1 = (double) intSide1;
                    }
                    System.out.print("두 번째 변의 길이를 입력하세요: ");
                    double side2;
                    if (scanner.hasNextDouble()) {
                        side2 = scanner.nextDouble();
                    } else {
                        // double 형식으로 변환할 수 없는 경우에는 int로 시도
                        int intSide2 = scanner.nextInt();
                        side2 = (double) intSide2;
                    }
                    System.out.print("세 번째 변의 길이를 입력하세요: ");
                    double side3;
                    if (scanner.hasNextDouble()) {
                        side3 = scanner.nextDouble();
                    } else {
                        // double 형식으로 변환할 수 없는 경우에는 int로 시도
                        int intSide3 = scanner.nextInt();
                        side3 = (double) intSide3;
                    }
                    if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                        System.out.println("변의 길이는 0보다 커야 합니다.");
                    } else {
                        // 삼각형 객체 생성 후 배열에 추가
                        shape = new Triangle(triangleName, triangleColor, side1, side2, side3);
                        shapes[shapeCount++] = shape; // 배열에 도형 추가 후 카운트 증가
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    System.out.println();
                    scanner.next(); // 잘못된 입력 버리기
                    }
                break;

                    
                case 4:
                    if (shapeCount == 0) {
                        System.out.println("저장된 도형이 없습니다.");
                        System.out.println();
                    } else {
                        System.out.println("------저장된 도형 목록------");
                        for (int i = 0; i < shapeCount; i++) {
                            System.out.println((i + 1) + ". " + shapes[i].name + " (" + shapes[i].getFigureName() + ")");
                        }
                    }
                    break;
                    
                case 5:
                    if (shapeCount == 0) {
                        System.out.println("저장된 도형이 없습니다.");
                    } else {
                        System.out.println("삭제할 도형 번호를 입력하세요:");
                        for (int i = 0; i < shapeCount; i++) {
                            System.out.println((i + 1) + ". " + shapes[i].name + " (" + shapes[i].getFigureName() + ")");
                        }
                        int removeIndex = scanner.nextInt() - 1;
                        if (removeIndex >= 0 && removeIndex < shapeCount) {
                            for (int i = removeIndex; i < shapeCount - 1; i++) {
                                shapes[i] = shapes[i + 1];
                            }
                            shapes[--shapeCount] = null; // 삭제된 도형 자리 null로 초기화 및 카운트 감소
                            System.out.println("도형이 삭제되었습니다.");
                        } else {
                            System.out.println("잘못된 번호입니다.");
                        }
                    }
                    break;
                    
                case 6:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                    
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }

            if (shape != null) {
                shape.draw();
                System.out.println("면적: " + df.format(shape.area()));
                System.out.println("둘레: " + df.format(shape.perimeter()));
            }

        } while (!exit);

        scanner.close();
    }
}
