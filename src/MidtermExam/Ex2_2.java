package MidtermExam;

//변수, 리터럴, 상수 활용
//원의 면적을 구하는 프로그램을 작성해보자(반지름 10.0, 파이 값 3.14)
public class Ex2_2 {

	public static void main(String[] args) {
		final double PI = 3.14; //원주율 상수로 선언
		
		double radius = 10.0; //원의 반지름
		double circleArea = radius*radius*PI; //원의 면적 계산
		
		//원 면적 출력
		System.out.println("원 면적: " + circleArea);
	}

}
