
/**
 * Circle 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 * @version (20240507)
 */
public class Circle
{
    //인스턴스 변수
    public int radius;
    public String name;
    
    public Circle(){ //원의 생성자
        
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    public static void main(String[] args){
        Circle pizza; //배열 만들었던 것처럼
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "페페로니 피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);
        
        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "던킨 도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);
    }
}
