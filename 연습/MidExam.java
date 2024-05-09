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
        for(int j = 0; j < row; j++) {
            int sum = 0;
            int n = 0;
            double average = 0.0;
            
            int i = 0;
            do {
                try {
                    sum += array[i][j];
                    n++;
                } catch(ArrayIndexOutOfBoundsException e) {
                    continue;
                }
                i++;
            } while(i < array.length);
            average = (double)sum / (double)n;
            System.out.println((j + 1) + "번째 열 : 합=" + sum + " " + "평균 =" + average);
        }
    }
}
