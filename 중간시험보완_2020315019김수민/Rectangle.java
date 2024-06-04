
/**
 * Rectangle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Rectangle extends Shape
{
    private double width, height;
    
    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }
    
    public void draw(){
        System.out.println(name + "Rectangle");
    }
    
    public double area(){ //직사각형 면적 계산 후 반환
        return width * height;
    }
}
