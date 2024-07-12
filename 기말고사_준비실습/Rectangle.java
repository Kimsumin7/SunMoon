
/**
 * Rectangle 클래스의 설명을 작성하세요.
 *
 * @author (김수민)
 * @version (24-06-11)
 */
class Rectangle extends Shape implements CanDraw
{
    //생성자
    public Rectangle(String name, int width,int height){
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    private double familyBonus(){
        return (double)height*10;
    }
    
    @Override
    public double getArea(){
        return width * height + familyBonus();
    }
    
    @Override
    public void draw(){
        System.out.println("<사각형: " + super.toString() + ", 면적" + this.getArea() + ">");
    }
}
