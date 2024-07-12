
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (김수민)
 * @version (24-06-11)
 */
public class MyApp
{
    public static void main(String[] args){
        Shape[] list = {
          new Rectangle("아빠 사각형", 12, 1),
          new Rectangle("엄마 사각형", 11, 7),
          new Rectangle("나의 사각형", 7, 23),
          new Triangle("이모 삼각형", 1, 1),
          new Triangle("친구 삼각형", 8, 15)
        };
        
        double result = computerArea(list);
    
        System.out.println("총 면적:" + result);
    }
    
    //도형 디테일 출력(draw())+누적 면적값 계산 -> 반환
    public static double computerArea(Shape[] shapeArray){
        double totalArea = 0.0;
        for(Shape shape:shapeArray){ //shapeArray배열에 있는 도형을 순회
            ((CanDraw)shape).draw(); //업캐스팅: shape클래스가 CanDraw인터페이스 구현x, 따라서
            //하지만 Shape 타입으로 업캐스팅된 객체를 CanDraw 인터페이스 타입으로
            //다시 다운캐스팅하여 draw 메서드에 접근
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
