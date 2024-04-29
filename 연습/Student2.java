
public class Student2
{
    int studentID;
    String studentName;
    int grade;
    String address;
    
    public void showStudentInfor(){
        System.out.println(studentName + "," + grade);
    }
    
    public String getStudentNmae(){ //사용하는 코드 입장에서 쓴다
        return studentName;
    }
    
    public static void main(String[] args){
                //참조변수  
        Student studentKim = new Student();
       studentKim.studentName = "김수민";
       studentKim.address = "천안시";
    }
}
