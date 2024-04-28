import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("온도를 입력해 주세요>> ");
        
        int temperature = scanner.nextInt();
        
        String recommendation = recommendationSen(temperature);
        System.out.println(recommendation);
        
        scanner.close();
    }
    
    public static String recommendationSen(int temperature) {
        return temperature < 20 ? "실내에서 영화 보기 추천":
               temperature < 30 ? "등산하기 추천" : "해변에서 선탠하기 추천";
    }
}
