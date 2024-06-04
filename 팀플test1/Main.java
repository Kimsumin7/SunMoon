import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeManagementSystem gradeSystem = new GradeManagementSystem();
        gradeSystem.run();
    }
}

class GradeManagementSystem {
    Student[] students = new Student[3]; // 최대 3명의 학생 정보 저장
    int studentCount = 0;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======================================================================");
            System.out.println("|                  다음 프로그램 메뉴 중 하나를 선택하세요.               |");
            System.out.println("| 1. 입력: 세 학생의 데이터를 입력(학번,성명,국어 성적,영어 성적,수학 성적)   |");
            System.out.println("| 2. 개인별 출력                                                      |");
            System.out.println("| 3. 한 분반 성적 출력                                                 |");
            System.out.println("| 4. 종료                                                            |");
            System.out.println("======================================================================");

            System.out.print("번호 입력=> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentCount < students.length) {
                        System.out.print("학번, 이름, 국어, 영어, 수학 성적 입력: ");
                        String id = scanner.next();
                        String name = scanner.next();
                        int kor = scanner.nextInt();
                        int eng = scanner.nextInt();
                        int math = scanner.nextInt();
                        students[studentCount++] = new Student(id, name, kor, eng, math);
                    } else {
                        System.out.println("더 이상 학생 정보를 입력할 수 없습니다.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentCount; i++) {
                        students[i].printIndividualGrade();
                    }
                    break;
                case 3:
                    printClassGrade();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("1~4번의 메뉴만 가능합니다. 원하는 메뉴를 다시 입력하세요.");
                    break;
            }
        }
    }

    public void printClassGrade() {
        System.out.println("################학급 성적표################");
        System.out.println("---------------------------------------------");
        System.out.println("학번\t성명\t국어\t국어학점\t영어\t영어학점\t수학\t수학학점\t총점\t평균");
        System.out.println("---------------------------------------------");
        for (Student student : students) {
            if (student != null) {
                int total = student.scores[0] + student.scores[1] + student.scores[2];
                double avg = total / 3.0;
                System.out.printf("%s\t%s\t%d\t%c\t%d\t%c\t%d\t%c\t%d\t%.2f\n",
                        student.id, student.name,
                        student.scores[0], student.grades[0],
                        student.scores[1], student.grades[1],
                        student.scores[2], student.grades[2],
                        total, avg);
            }
        }
        System.out.println("---------------------------------------------");
    }
}
