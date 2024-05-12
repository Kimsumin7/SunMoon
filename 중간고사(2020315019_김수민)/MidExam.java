
/**
 * MidExam 클래스의 설명을 작성하세요.
 *
 * @author (김수민_2020315019)
 * @version (4/30)
 */
public class MidExam
{
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
    
    //raggedArray
    static void raggedArray(int[][] intArr){
        
    }
    
    //findLongestRowLength
    static void findLongestRowLength(){
        
    }
    
    //longestRowLength
    static void longestRowLength(){
        
    }
    
    //calculateArray
    static void calculateArray(){
        
    }
    
    
    public static void main(String[] args){
        int intArray[][];
        
    }
}
