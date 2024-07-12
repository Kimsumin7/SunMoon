
/**
 * Staft 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (24-06-12)
 */
class Staff extends Employee implements CanSpeak
{
    public Staff(String name, int salary, int hoursWorked){
        this.name = name;
        this.salary = salary;
        this.hoursWorked = 80; 
    }
    
    @Override
    public double pay(){
        return salary * hoursWorked + 80;
    }
    
    @Override
    public void say(){
        System.out.println("<직원 : " + this.name + "," + this.pay() + ">");
    }
}
