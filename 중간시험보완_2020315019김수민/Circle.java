
/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Circle extends Shape
{
    private double radius; //반지름
    
    public Circle(String name, double radius){
        super(name); //super로 shape생성자 호출
        this.radius = radius;
    }
    
    public void draw(){ //어떤 도형을 그리는지
        System.out.println(name + "Circle");
    }
    
    public double area(){ //원의 면적 구하기 공식
        return Math.PI * radius * radius;
    }
    
    //메서드 오버로딩 2가지 버전
    public void setRedius(double radius){
        this.radius = radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
}
