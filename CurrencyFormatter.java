//This programm is a currency formatter program
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class CurrencyFormatter { 
    //...main...
    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);//US
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);//India
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);//China
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);//France
        System.out.println("US: "     + us.format(payment));//Printing currency in every country's curreny
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

//....HackerRank Code....
