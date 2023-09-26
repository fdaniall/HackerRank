import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            int temp = n * i;
            System.out.println(n + " x " + i + " = " + temp);
        }
    }
}