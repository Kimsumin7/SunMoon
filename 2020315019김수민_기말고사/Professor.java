
/**
 * Professor 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (24-06-12)
 */
class Professor extends Employee implements CanSpeak
{
    public Professor(String name, int salary, int hoursWorked){
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked; 
    }
    
    private double bonus(){
        return (double)hoursWorked * 200;
    }
    
    @Override
    public double pay(){
        return salary * hoursWorked + bonus();
    }
    
    @Override
    public void say(){
        System.out.println("<교수 : " + super.name + "," + this.pay() + ">");
    }
}
