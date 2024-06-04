import java.util.Scanner;

class Student {
    private String 이름;
    private int 학번;
    private String[] 과목;

    // 생성자
    public Student(String 이름, int 학번, String[] 과목) {
        this.이름 = 이름;
        this.학번 = 학번;
        this.과목 = 과목;
    }

    // 학생 이름을 가져오는 메소드
    public String get이름() {
        return 이름;
    }

    // 학생 학번을 가져오는 메소드
    public int get학번() {
        return 학번;
    }

    // 학생이 듣는 과목을 가져오는 메소드
    public String[] get과목() {
        return 과목;
    }

    // 학생의 성적표를 출력하는 메소드
    public void displayReportCard() {
        System.out.println("이름: " + 이름);
        System.out.println("학번: " + 학번);
        System.out.println("과목: " + String.join(", ", 과목));
        System.out.println();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수 입력 받기
        System.out.print("학생 수를 입력하세요: ");
        int 학생수 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 학생 생성
        Student[] 학생들 = new Student[학생수];
        for (int i = 0; i < 학생수; i++) {
            System.out.println("\n학생 " + (i + 1) + "의 정보를 입력하세요:");
            System.out.print("이름을 입력하세요: ");
            String 이름 = scanner.nextLine();
            System.out.print("학번을 입력하세요: ");
            int 학번 = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기
            System.out.print("듣는 과목을 입력하세요(여러 개의 과목을 쉼표로 구분하여 입력하세요): ");
            String 과목입력 = scanner.nextLine();
            String[] 과목 = 과목입력.split(",\\s*");

            // 학생 객체 생성
            학생들[i] = new Student(이름, 학번, 과목);
        }

        // 각 학생의 성적표 출력
        System.out.println("\n각 학생의 성적표:");
        for (Student 학생 : 학생들) {
            학생.displayReportCard();
        }

        scanner.close();
    }
}
