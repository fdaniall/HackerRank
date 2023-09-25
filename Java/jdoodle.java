import java.util.*;
import java.io.*;
import java.math.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            int output = 0;
            for(int j=0; j<c; j++){
                
                int temp = a + (int)(Math.pow(2, j) * b);
                
                if(j == 0){
                    output = temp + output;
                } else {
                    output = temp + output - a;
                }
                System.out.print(output+" ");
            }
            System.out.println();
        }
    }
}