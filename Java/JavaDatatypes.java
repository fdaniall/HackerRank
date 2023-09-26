import java.util.*;
import java.io.*;
import java.math.*;

public class JavaDatatypes{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            BigInteger n = new BigInteger(scanner.next());;
            
            if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* long");
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
    }
}