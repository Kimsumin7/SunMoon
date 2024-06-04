
/**
 * ColorPoint 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class ColorPoint extends Point
{
    private String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}