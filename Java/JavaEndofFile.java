import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndofFile {

    public static void main(String[] args) {
        
        int no = 1;
        Scanner scanner = new Scanner(System.in);
        
        String kata;
        while(scanner.hasNext()){
            kata = scanner.nextLine();
            
            System.out.println(no+ " " +kata);
            no++;
        }
    }
}