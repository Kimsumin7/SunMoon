package JAVA0402;

public class MultiplicationTable2 {

	public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        int i = 1;

        do {
            System.out.println(i + "��");
            int j = 1;

            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }

            System.out.println(); // �� �� 異��� �� �� 以� ��湲�
            i++;
        } while (i <= 9);
    }
}