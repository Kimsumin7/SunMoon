
/**
 * Point 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (20240528)
 */
class Point{
    private int x, y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
