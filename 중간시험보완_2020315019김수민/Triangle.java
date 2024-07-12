
/**
 * Triangle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
import java.util.Arrays;

class Triangle extends Shape {
    private double side1, side2, side3; // 세 변의 길이

    // 생성자
    public Triangle(String name, String color, double side1, double side2, double side3) {
        super(name, color);
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("변의 길이는 0보다 커야 합니다.");
            return;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // draw() 메서드
    public void draw() {
        System.out.println("Drawing " + color + " Triangle");
    }

    // area() 메서드
    public double area() {
        // Heron's formula를 사용하여 삼각형의 넓이 계산
        double s = (side1 + side2 + side3) / 2;
        double area = s * (s - side1) * (s - side2) * (s - side3);
        return squareRoot(area); // 넓이 계산 후 제곱근 적용
    }

    // 제곱근 구하는 메서드
    private double squareRoot(double number) {
        double guess = number / 2; // 초기 추측값 설정
        double tolerance = 0.0001; // 허용 오차

        // Newton's method를 사용하여 근사값 계산
        while (Math.abs(guess * guess - number) > tolerance) {
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }

    // perimeter() 메서드
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // 도형의 이름을 반환하는 메서드
    public String getFigureName() {
        return "Triangle";
    }

    // 삼각형이 정삼각형인지 확인하는 메서드
    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    // 삼각형이 이등변 삼각형인지 확인하는 메서드
    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    // 삼각형이 직각삼각형인지 확인하는 메서드
        public boolean isRightAngled() {
        // 세 변의 길이를 배열로 저장
        double[] sides = {side1, side2, side3};
    
        // 세 변의 길이를 오름차순으로 정렬
        Arrays.sort(sides);
    
        // 제일 긴 변의 제곱
        double longestSideSquared = sides[2] * sides[2];
    
        // 나머지 두 변의 제곱의 합
        double sumOfOtherSidesSquared = sides[0] * sides[0] + sides[1] * sides[1];
        
        // 가장 긴 변의 제곱과 나머지 두 변의 제곱의 합이 같으면 직각 삼각형
        return longestSideSquared == sumOfOtherSidesSquared;
    }

}

