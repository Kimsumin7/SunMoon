public class CalRaggedArray {

    // ragged array 생성 메서드
    static int[][] makeArray() { 
        // 길이가 다른 배열 생성
        int temp[][] = new int[4][];  

        // 각 행에 대한 길이 설정
        temp[0] = new int[3];
        temp[1] = new int[2];
        temp[2] = new int[3];
        temp[3] = new int[2];
        
        // 방법 1과 방법 2는 주석 처리하여 사용할 수 있음

        return temp;
    }

    // 배열 초기화 메서드
    static void initArray(int [][] intArr) {
        // 별도의 temp 배열 생성 필요 없음
        // temp = intArr;

        // 배열 초기화
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = (i + 1) * 10 + j;
            }
        }
    }   

    // 배열 출력 메서드
    static void printArray(int [][] intArr) {
        // 별도의 temp 배열 생성 필요 없음
        // temp = intArr;

        // 배열 출력
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 배열 합계 출력 메서드
    static void sumArray(int [][] intArr) {
        // 별도의 temp 배열 생성 필요 없음
        // temp = intArr;

        // 각 행의 합계 출력
        System.out.println("======================");
        for (int i = 0; i < intArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < intArr[i].length; j++) {
                sum += intArr[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int intArray[][]; 
        // ragged array 생성
        intArray = makeArray();
        // 배열 초기화
        initArray(intArray);
        // 배열 출력
        printArray(intArray);
        // 배열 합계 출력
        sumArray(intArray);
    }
}
