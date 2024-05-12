
/**
 * Student 클래스의 설명을 작성하세요.
 *
 * @author (Innovative Thinkers)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Student {
    String id;
    String name;
    int[] scores = new int[3]; // 국어, 영어, 수학 성적
    char[] grades = new char[3]; // 각 과목의 학점
    
    public Student(String id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.scores[0] = kor;
        this.scores[1] = eng;
        this.scores[2] = math;
        calculateGrades();
    }
    
    private void calculateGrades() {
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i] >= 90) {
                this.grades[i] = 'A';
            } else if (this.scores[i] >= 80) {
                this.grades[i] = 'B';
            } else if (this.scores[i] >= 70) {
                this.grades[i] = 'C';
            } else if (this.scores[i] >= 60) {
                this.grades[i] = 'D';
            } else {
                this.grades[i] = 'F';
            }
        }
    }
    
    public int getTotalScore() {
        int total = 0;
        for (int score : this.scores) {
            total += score;
        }
        return total;
    }
    
    public float getAverageScore() {
        return getTotalScore() / 3.0f;
    }
    
    public void printIndividualGrade() {
        System.out.println("#### " + this.name + " 성적표 ####");
        System.out.println("-----------------------------");
        System.out.println("학번\t\t:" + this.id);
        System.out.println("성명\t\t:" + this.name);
        System.out.println("-----------------------------");
        System.out.println("국어\t\t:" + this.scores[0]);
        System.out.println("국어학점\t:" + this.grades[0]);
        System.out.println("영어\t\t:" + this.scores[1]);
        System.out.println("영어학점\t:" + this.grades[1]);
        System.out.println("수학\t\t:" + this.scores[2]);
        System.out.println("수학학점\t:" + this.grades[2]);
        System.out.println("-----------------------------");
        System.out.println("총점\t\t:" + getTotalScore());
        System.out.printf("평균\t\t:%.2f\n", getAverageScore());
        System.out.println();
    }
}

