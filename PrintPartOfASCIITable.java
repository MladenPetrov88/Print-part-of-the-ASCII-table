import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        char a = (char) num1;
        char b = (char) num2;

        for (int i = a; i <= b ; i++) {
            System.out.print((char) i +  " ");
        }

    }
}
