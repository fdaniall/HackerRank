import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i<3; i++){
            String language = scanner.next();
            int digit = scanner.nextInt();
            scanner.nextLine();
            
            System.out.printf("%-15s%03d%n", language, digit);
        }
        System.out.println("================================");
    }
}