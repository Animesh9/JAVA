import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;
import java.util.Scanner;
class exp7 {
String[] name = new String[5];
int[] rollno = new int[5];
}
public class Exception1 {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
exp7 obj = new exp7();

System.out.println(Arrays.toString(obj.name));
System.out.println(Arrays.toString(obj.rollno));
}
}
