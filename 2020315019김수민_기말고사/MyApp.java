
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (24-06-12)
 */
public class MyApp
{
    public static void main(String[] args){
        Employee[] list = {
            new Professor("홍길동", 20, 16),
            new Professor("이순신", 20, 10),
            new Professor("강감찬", 31, 5),
            new Staff("김유신", 50, 80),
            new Staff("유관순", 19, 80)
        };
        
        double result = computer(list);
        
        System.out.println("급여총합 = " + result);
    }
    
    public static double computer(Employee[] emArray){
        double totalPay = 0.0;
        for(Employee employee:emArray){
            ((CanSpeak)employee).say();
            totalPay += employee.pay();
        }
        return totalPay;
    }
}
