
/**
 * ColorPoint 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (20240528)
 */
class ColorPoint extends Point{
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}