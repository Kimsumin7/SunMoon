
/**
 * Overriding 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
class Cannon extends Weapon{
    @Override
    protected int fire(){
        return 10;
    }
}

public class Overriding
{
    public static void main(String[] args){
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은" + weapon.fire());
        
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은" + weapon.fire());
    }
}
