/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240514)
 */
public class Circle
{
    double radius;
    String color;
    String name;
    
    public Circle(double r, String c, String n){
        radius = r;
        color = c;
        name = n;
    }
 
    public void setRadius(){
        radius = radius * Math.PI;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}

