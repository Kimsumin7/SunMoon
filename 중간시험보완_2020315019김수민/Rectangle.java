
/**
 * Rectangle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Rectangle extends Shape {
    private double width, height; // 너비와 높이

    // 생성자
    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        if (width <= 0 || height <= 0) {
            System.out.println("너비와 높이는 0보다 커야 합니다.");
            return;
        }
        this.width = width;
        this.height = height;
    }

    // draw() 메서드
    public void draw() {
        System.out.println("Drawing " + color + " " + name + " Rectangle");
    }

    // area() 메서드
    public double area() {
        return width * height;
    }

    // perimeter() 메서드
    public double perimeter() {
        return 2 * (width + height);
    }

    // 도형의 이름을 반환하는 메서드
    public String getFigureName() {
        return "Rectangle";
    }
}
