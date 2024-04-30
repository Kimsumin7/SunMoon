import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 학생 수와 과목 수를 입력 받음
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();
        System.out.print("과목 수를 입력하세요: ");
        int subjectCount = scanner.nextInt();
        
        // 성적을 저장할 2차원 배열 생성
        int[][] grades = new int[studentCount][subjectCount];
        
        // 성적 입력 받기
        for (int i = 0; i < studentCount; i++) {
            System.out.println("학생 " + (i + 1) + "의 성적을 입력하세요:");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + "의 성적: ");
                grades[i][j] = scanner.nextInt();
            }
        }
        
        // 입력된 성적 출력
        System.out.println("입력된 성적:");
        printGrades(grades);
        
        // 각 학생의 평균 성적 계산 및 출력
        System.out.println("각 학생의 평균 성적:");
        calculateAndPrintStudentAverages(grades);
        
        // 각 과목의 평균 성적 계산 및 출력
        System.out.println("각 과목의 평균 성적:");
        calculateAndPrintSubjectAverages(grades);
        
        scanner.close();
    }
    
    // 입력된 성적을 출력하는 메서드
    static void printGrades(int[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print("학생 " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // 각 학생의 평균 성적을 계산하고 출력하는 메서드
    static void calculateAndPrintStudentAverages(int[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = (double) sum / grades[i].length;
            System.out.println("학생 " + (i + 1) + "의 평균 성적: " + average);
        }
    }
    
    // 각 과목의 평균 성적을 계산하고 출력하는 메서드
    static void calculateAndPrintSubjectAverages(int[][] grades) {
        for (int j = 0; j < grades[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i][j];
            }
            double average = (double) sum / grades.length;
            System.out.println("과목 " + (j + 1) + "의 평균 성적: " + average);
        }
    }
}
