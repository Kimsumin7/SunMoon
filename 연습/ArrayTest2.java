//실수 : float(4byte), double(8byte)

public class ArrayTest2
{
     public static void main(String[] args){
         double[] num = new double[5];
         int size = 0;
         
         num[0] = 10.0; size++;
         num[1] = 20.0; size++;
         num[2] = 30.0; size++;
         
         //배열이 5개라 0.0이 2개 나왔었는데 size를 넣으니 유효한 값만 추출 
         double total = 0.0;
         
         for(int i=0; i<size; i++){
             System.out.println(num[i]);
             total *= num[i];
         }
         
         System.out.println("total=" + total);
     }
}
