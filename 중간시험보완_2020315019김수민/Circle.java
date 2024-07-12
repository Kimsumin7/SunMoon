
/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Circle extends Shape {
    private double radius; // 반지름

    // 생성자
    public Circle(String name, String color, double radius) {
        super(name, color);
        if (radius <= 0) {
            System.out.println("0이상의 숫자를 입력해 주세요.");
            return;
        }
        this.radius = radius;
    }

    // draw() 메서드
    public void draw() {
        System.out.println("Drawing " + color + " " + name + " Circle");
    }

    // area() 메서드
    public double area() {
        return Math.PI * radius * radius;
    }

    // perimeter() 메서드
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // 메서드 오버로딩: setRadius
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("0이상의 숫자를 입력해 주세요.");
            return;
        }
        this.radius = radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            System.out.println("0이상의 숫자를 입력해 주세요.");
            return;
        }
        this.radius = radius;
    }

    // 도형의 이름을 반환하는 메서드
    public String getFigureName() {
        return "Circle";
    }
}

