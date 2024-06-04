
/**
 * myCicleApp 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240514)
 */
public class myCircleApp
{
    public static void main(String[] args){
        Circle moon = new Circle(10, "Yellow", "Moon");
        Circle sun = new Circle(30, "Red", "Sun");
        
        moon.setRadius();
        sun.setRadius();
        
        double moonArea = moon.getRadius();
        double sunArea = sun.getRadius();
        
        System.out.println(moon.getName() + "의 면적: " + moonArea);
        System.out.println(sun.getName() + "의 면적: " + sunArea);
    }
}
