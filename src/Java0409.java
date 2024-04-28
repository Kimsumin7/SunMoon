
public class Java0409 {

	public static void main(String[] args) {
		printMultiplicationTable();
	}
	
	public static void printMultiplicationTable() {
		//i라는 변수에 1저장
		int i = 1;
		
		//outer loop
		do {
			System.out.print(i + "단" + "\t");
			int j = 1;
			
			//inner loop
			while (j < 10) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
				j++;
			}
			
			System.out.println();
			i++;
			
		} while (i < 10);
	}

}
