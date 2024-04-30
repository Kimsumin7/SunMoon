
public class CalRaggedArray2
{
   static int[][] makeArray(){
       int temp[][] = new int[4][];
       int index = 1;
       
       for(int i=0; i<temp.length; i++){
           if(i%2==0){
               temp[i] = new int[3];
           }else{
               temp[i] = new int[2];
           }
       }
       return temp;
   }
    
   //배열 초기화 
   static void initArray(int[][] intArr){
       int temp[][] = new int[4][];
       temp = intArr;
       for(int i=0; i<temp.length; i++){
           for(int j=0; j<temp[i].length; j++){
               temp[i][j] = (i+j)*10+j;
           }
       }
   }
   
   //배열 출력 
   static void printArray(int[][] intArr){
       int temp[][] = new int[4][];
       temp = intArr;
       for(int i=0; i<temp.length; i++){
           for(int j=0; j<temp[i].length; j++){
               System.out.print(temp[i][j] + "\t");
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

    
   public static void main(String[] args){
       int intArray[][];
       intArray = makeArray();
       initArray(intArray);
       printArray(intArray);
       sumArray(intArray);
       columnSumArray(intArray);
   }
}
