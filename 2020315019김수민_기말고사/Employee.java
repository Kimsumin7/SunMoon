
/**
 * Employee 클래스의 설명을 작성하세요.
 *
 * @author (김수민2020315019)
 * @version (24-06-12)
 */
public abstract class Employee
{
    public int hoursWorked;
    public String name;
    protected int salary;
    
    public String toString(){
        return name;
    }
    
    public abstract double pay();
}
