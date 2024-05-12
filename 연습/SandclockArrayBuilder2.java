public class SandclockArrayBuilder2 {
    //모래시계
    public static void main(String[] args) {
       
        //[1] 준비
        int A[][] = new int[7][7]; //0~6 : 7개 , 7행7열배열
        int CENTER = (int) A.length/2 ; //2 기준행.
        int K=0; //출력할값을 담은 변수
        int BEGIN = 0; //열의 시작위치
        int END = A[0].length; //열의 끝 위치
       
        //[2] 처리
        for(int ROW=0;ROW<A.length;ROW++){         
           
            if(ROW<=CENTER){ //기준행보다 작거나 같은 행일때.
                BEGIN = ROW;
                END = (A[ROW].length -1) - ROW;
            }else{
                BEGIN = (A[ROW].length -1) - ROW;
                END = ROW;
                       
            }
            for(int COL=BEGIN;COL<=END;COL++){             
                K = K+1;
                A[ROW][COL] = K;
            }              
        }      
       
        //[3] 출력
        for(int i = 0; i<A.length;i++){        
            for(int j =0; j< A[i].length;j++){
                if(A[i][j] == 0) {
                    System.out.print("\t");
                }else{
                    System.out.print(A[i][j]+"\t");
                }              
            }
            System.out.println();
        }      
    }//end main()
}//end