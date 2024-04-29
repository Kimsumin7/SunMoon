
public class Student
{
    //변수 선언
    int studentID, grade;
    String studentName, address;
    
    public void showStudentInfor(){
        System.out.println(studentName + "," + address);
    }
    
   public static void main(String[] args){
       Student studentKim = new Student();
       studentKim.studentName = "김수민";
       studentKim.address = "천안시";
       
       studentKim.showStudentInfor();
   }
}
