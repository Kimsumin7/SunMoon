package JAVA0402;

public class test {

	public static void main(String[] args) {
		print99dan();
	}
	
	public static void print99dan() {
		int i = 1;
		
		while (i <= 9) {
			System.out.println(i + "��");
			int j = 1;
			
			do {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			} while (j <= 9);
			
			System.out.println();
			i++;
		}
	}

}
