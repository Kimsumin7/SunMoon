/**
 * Circle1 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240507)
 */

public class Circle1 {
    // 인스턴스 변수
    public int radius;
    public String name;
    public String color;

    public Circle1() { // 원의 생성자

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // moon
        Circle1 Moon = new Circle1();
        Moon.radius = 10;
        Moon.name = "Moon";
        Moon.color = "yellow";
        double area = Moon.getArea();
        System.out.println(Moon.name + "의 면적은 " + area + ", color는 " + Moon.color);

        // sun
        Circle1 Sun = new Circle1();
        Sun.radius = 10;
        Sun.name = "Sun";
        Sun.color = "red";
        area = Sun.getArea();
        System.out.println(Sun.name + "의 면적은 " + area + ", color는 " + Sun.color);
    }
}
