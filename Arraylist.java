import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d,q,x,y;
        ArrayList[] list = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            d = s.nextInt();
            list[i] = new ArrayList();
            for(int j=0;j<d;j++){  
                list[i].add(s.nextInt());                
            }
        }
       
    }
}
