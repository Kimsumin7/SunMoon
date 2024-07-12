
/**
 * Triangle 클래스의 설명을 작성하세요.
 *
 * @author (김수민)
 * @version (24-06-11)
 */
class Triangle extends Shape implements CanDraw
{
    public Triangle(String name, int width,int height){
        this.name = name;
        this.width = width;
        this.height = 10;
    }
    
    @Override
    public double getArea(){
        return 0.5 * width + height; //"밑변*높이/2  여기서 0.5는 1/2와 같음
    }
    
    @Override
    public void draw(){
        System.out.println("<삼각형: " + this.name + ", 면적" + this.getArea() + ">");
    }
}
