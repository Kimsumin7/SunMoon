
/**
 * Point 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Point
{
   private int x,y;
   public Point(){
       this.x = this.y = 0;
   }
   public Point(int x, int y){
       this.x = x;
       this.y = y;
   }
   public void showPoint(){
       System.out.println("(" + x + "," + y + ")");
   }
}
