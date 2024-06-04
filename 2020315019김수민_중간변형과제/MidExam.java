
/**
 * MidExam 클래스의 설명을 작성하세요.
 *
 * @author (2020315019 김수민)
 */
public class MidExam {
    public static void main(String[] args) {
        int[][] raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray, longestRowLength);
    }
    
    public static int[][] makeArray() {
        int[][] array = {
          {77, 47, 73, 98},
          {94, 92},
          {28, 64, 83},
          {34, 78, 91, 55}
        };
        return array;
    }
    
    public static int findLongestRowLength(int[][] raggedArray) {
        int longestRowLength = raggedArray[0].length;
        for(int[] array : raggedArray) {
            longestRowLength = Math.max(longestRowLength, array.length);
        }
        return longestRowLength;
    }
    
    public static void calculateArray(int[][] array, int row) {
    int j = 0;
    //do-while
    do {
        int sum = 0;
        int n = 0;
        double average = 0.0;

        int i = 0;
        //while
        while (i < array.length) {
            try {
                sum += array[i][j];
                n++;
            } catch (ArrayIndexOutOfBoundsException e) { //예외처리
                i++; 
                continue;
            }
            i++;
        }
        average = (double) sum / (double) n;
        System.out.printf("%d번째 열 : 합=%d 평균=%.2f\n", (j + 1), sum, average);
        j++;
    } while (j < row);
}

}