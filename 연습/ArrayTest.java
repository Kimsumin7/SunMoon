//정수 : byte(1byte), short(2byte), int(4byte), long(8byte)

public class ArrayTest
{
    public static void main(String[] args){
        //배열 초기화
        int[] numbers = new int[3];
        
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
                             //length:배열의 길이를 나타냄 
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        double[] studentIDs = new double[5];
        
        for(int i=0; i<studentIDs.length; i++){
            System.out.println(studentIDs[i]);
        }
    }
}
