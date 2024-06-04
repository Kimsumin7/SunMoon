
/**
 * ColorPointEx 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (20240528)
 */



public class ColorPointEx
{
    public static void main(String[] args){
        Point p = new Point();
        p.set(1,2);
        p.showPoint();
        
        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
