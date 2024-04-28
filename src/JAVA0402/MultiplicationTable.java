package JAVA0402;

public class MultiplicationTable {

	public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        int i = 1;

        while (i <= 9) {
            System.out.println(i + "단");
            int j = 1;

            do {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            } while (j <= 9);

            System.out.println(); //�� 以� ���곌린
            i++;
        }
    }
}
