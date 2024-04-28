package JAVA0402;

public class test2 {

	public static void main(String[] args) {
		print99dan();

	}
	
	public static void print99dan() {
		int i = 1;
		
		do {
			System.out.println(i + "��");
			int j = 1;
			
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			
			System.out.println();
			i++;
		} while (i <= 9);
	}
}
