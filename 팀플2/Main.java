import java.util.Arrays;

class Student {
    private String 이름;
    private int 학번;
    private double[] 성적;

    // 생성자
    public Student(String 이름, int 학번, double[] 성적) {
        this.이름 = 이름;
        this.학번 = 학번;
        this.성적 = 성적;
    }

    // 학생 이름을 가져오는 메소드
    public String get이름() {
        return 이름;
    }

    // 학생 학번을 가져오는 메소드
    public int get학번() {
        return 학번;
    }

    // 학생 성적을 가져오는 메소드
    public double[] get성적() {
        return 성적;
    }

    // 평균 성적을 계산하는 메소드
    public double calculateAverageGrade() {
        double 합계 = 0;
        for (double 성적 : 성적) {
            합계 += 성적;
        }
        return 합계 / 성적.length;
    }

    // 학생의 성적표를 출력하는 메소드
    public void displayReportCard() {
        System.out.println("이름: " + 이름);
        System.out.println("학번: " + 학번);
        System.out.println("성적: " + Arrays.toString(성적));
        System.out.println("평균 성적: " + calculateAverageGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        // 샘플 학생 데이터
        double[] grades1 = {85, 90, 75, 88};
        double[] grades2 = {78, 82, 95, 88};
        
        // 학생 객체 생성
        Student 학생1 = new Student("김", 1001, grades1);
        Student 학생2 = new Student("한", 1002, grades2);
        
        // 성적표 출력
        System.out.println("학생 1의 성적표:");
        학생1.displayReportCard();
        System.out.println("\n학생 2의 성적표:");
        학생2.displayReportCard();
    }
}
