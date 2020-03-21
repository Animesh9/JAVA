// HackerRank Code
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum=0;  
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        return sum;

    }

