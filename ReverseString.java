import java.io.*;
import java.util.*;
public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int count = 0;
        for(int i=0; i<A.length()/2;i++)
        if( A.charAt(i) == A.charAt(A.length()-i-1)) 
            count++;
        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;
    }
}
