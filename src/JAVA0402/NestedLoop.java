package JAVA0402;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "´Ü\t\t"); 
		}
		System.out.println();

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println(); 
		}
	}
}
