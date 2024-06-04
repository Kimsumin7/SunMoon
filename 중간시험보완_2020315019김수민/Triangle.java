
/**
 * Triangle 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Triangle extends Shape
{
    private double base, height;
    
    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }
    
    public void draw(){
        System.out.println("Drawing Triangle");
    }
    
    public double area(){
        return 0.5 * base * height;
    }
}
