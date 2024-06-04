/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240514)
 */
import java.util.Scanner;

public class Rectangle {
    int area;
    int width;
    int height;
    
    public Rectangle(){
        this(0,0);
    }
    
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
 
    public void calculateArea(){
        area = width*height;
    }
    
    public int getArea(){
        return area;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }

}
