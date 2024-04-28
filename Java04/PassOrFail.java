import java.util.Scanner; 

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요>> ");
        
        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("축하합니다, 시험 통과입니다!");
        }
        
        scanner.close();
    }
}
