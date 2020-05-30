import java.io.*; 
import java.util.Scanner;  
class SearchChar
{ 
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char a = s.next().charAt(0);
        int firstIndex = str.indexOf(a); 
        System.out.println("First occurrence of char 'a'" + " is found at : " + firstIndex); 
        char b = s.next().charAt(0);
        int lastIndex = str.lastIndexOf(b); 
        System.out.println("Last occurrence of char 'a' is" + " found at : " + lastIndex);
    }
}
