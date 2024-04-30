import java.util.Scanner;

public class CalRaggedArray3 {
    static int[][] makeArray() {
        int temp[][] = new int[4][];
        int index = 1;

        for (int i = 0; i < temp.length; i++) {
            if (i % 2 == 0) {
                temp[i] = new int[3];
            } else {
                temp[i] = new int[2];
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다.");
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

    // 각 행의 합계 출력
    static void sumArray(int[][] intArr) {
        System.out.println("======================");
        System.out.println("각 행의 합계 출력");
        for (int i = 0; i < intArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < intArr[i].length; j++) {
                sum += intArr[i][j];
            }
            System.out.println("행 " + i + "의 합계: " + sum);
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

    public static void main(String[] args) {
        int intArray[][];
        intArray = makeArray();
        initArray(intArray);
        printArray(intArray);
        sumArray(intArray);
        columnSumArray(intArray);
    }
}
