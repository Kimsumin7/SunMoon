
/**
 * Shape 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Shape {
    protected String name; // 도형의 이름
    protected String color; // 도형의 색상

    // 생성자
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 도형을 그리는 메서드
    public void draw() {
        System.out.println("Drawing " + color + " " + name + " of class " + getFigureName());
    }

    // 도형의 면적을 반환하는 메서드
    public double area() {
        return 0.0; // 기본적으로 0.0 반환, 각 도형 클래스에서 오버라이딩할 예정
    }

    // 도형의 둘레를 반환하는 메서드
    public double perimeter() {
        return 0.0; // 기본적으로 0.0 반환, 각 도형 클래스에서 오버라이딩할 예정
    }

    // 도형의 이름을 반환하는 메서드
    public String getFigureName() {
        return "Shape";
    }
}
