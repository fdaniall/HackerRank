import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US); 
        
        Locale localIndia = new Locale("en", "IN");
        NumberFormat formatIndia = NumberFormat.getCurrencyInstance(localIndia);
        NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = formatUS.format(payment);
        String india = formatIndia.format(payment);
        String china = formatChina.format(payment);
        String france = formatFrance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}