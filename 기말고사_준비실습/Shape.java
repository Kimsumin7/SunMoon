
/**
 * Shape 클래스의 설명을 작성하세요.
 *
 * @author (김수민)
 * @version (24-06-11)
 */
public abstract class Shape
{
    public String name;
    protected int width;
    public int height;
    
    public String toString(){
        return name;
    }
    
    public abstract double getArea();
}
