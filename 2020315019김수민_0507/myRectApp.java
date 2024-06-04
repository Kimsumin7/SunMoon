
/**
 * myRectApp 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240514)
 */
public class myRectApp
{
    public static void main(String[] args){
        Rectangle redRect = new Rectangle(5,3);
        Rectangle yelloRect = new Rectangle(5,4);
        Rectangle blueRect = new Rectangle(6,8);
        Rectangle basicRect = new Rectangle();
        
        redRect.calculateArea();
        System.out.println(redRect.getArea());
        yelloRect.calculateArea();
        System.out.println(yelloRect.getArea());
        blueRect.calculateArea();
        System.out.println(blueRect.getArea());
        basicRect.calculateArea();
        System.out.println(basicRect.getArea());
        
        System.out.println("세 삼각형의 면적의 합: " + (redRect.getArea() + yelloRect.getArea() + blueRect.getArea()));
    }
}
