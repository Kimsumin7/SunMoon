//5팀 김수민, 이다영

public class GuguDan
{
   public static void main(String[] args) {
		guguDan(); //guguDan 메서드 호출 
	}
	
	public static void guguDan() {
		//i라는 변수에 1저장
		int i = 1;
		
		//outer loop
		do {
			System.out.print("["+ i + "단]" + "\t"); //현재 단의 제목 출력  
			int j = 1; //j라는 변수에 1저장
			
			//inner loop
			while (j < 10) { //현재 단의 구구단을 출력하는 내부 반복문 
				System.out.print(i + "*" + j + "=" + (i*j) + "\t"); //곱셈값 결과 출력 
				j++; //j증가 
			}
			
			System.out.println(); //줄바꿈으로 다음 단 이동 
			i++;//i증가 
			
		} while (i < 10); //1~9단까지의 출력을 위한 조건
	}
}
