
/**
 * RaggedArray 클래스의 설명을 작성하세요.
 *
 * @author (김수민_2020315019)
 * @version (4/30)
 */
import java.util.Scanner;

public class RaggedArray {
    static int[][] makeArray() {
        int temp[][] = new int[4][];
        int index = 1;

        for (int i = 0; i < temp.length; i++) {
            try {
                if (i == 0) {
                    temp[i] = new int[4];
                } else if(i==1){
                    temp[i] = new int[2];
                } else if(i==2){
                    temp[i] = new int[3];
                } else if(i==3){
                    temp[i] = new int[4];
                }
            } catch (NegativeArraySizeException e) {
                System.out.println("음수 크기의 배열을 생성할 수 없습니다.");
            }
        }
        return temp;
    }

    // 배열 초기화
    static void initArray(int[][] intArr) {
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < intArr.length; i++) {
                for (int j = 0; j < intArr[i].length; j++) {
                    System.out.print("배열의 [" + i + "][" + j + "] 요소를 입력하세요: ");
                    intArr[i][j] = scanner.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("입력 오류가 발생했습니다.");
        } finally {
            scanner.close();
        }
    }

    // 배열 출력
    static void printArray(int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    // 각 열의 합계 출력
    static void columnSumArray(int[][] intArr) {
        System.out.println("======================");
        System.out.println("각 열의 합계 출력");
        for (int j = 0; j < intArr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i].length > j) {
                    sum += intArr[i][j];
                }
            }
            System.out.println("열 " + j + "의 합계: " + sum);
            
        }
    }
    
    //각 열의 평균 출력
    static void scoreArray(int[][] intArr){
        System.out.println("======================");
        System.out.println("각 열의 평균 출력");
        for (int j = 0; j < intArr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i].length > j) {
                    //sum += ((intArr[i][j])%intArr[i]);
                }
            }
            System.out.println("열 " + j + "의 평균: " + sum);
        }
    }

    public static void main(String[] args) {
        int intArray[][];
        intArray = makeArray();
        initArray(intArray);
        printArray(intArray);
        columnSumArray(intArray);
        scoreArray(intArray);
    }
}