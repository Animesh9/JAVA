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
for (int i = 0; i < obj.rollno.length; i++) {
try { // identification of error in try block
Scanner in = new Scanner(System.in);
System.out.println("Enter the name of the student");
obj.name[i] = in.nextLine();
System.out.println("Enter the roll no of the student");
obj.rollno[i] = in.nextInt();
}
catch (ArrayIndexOutOfBoundsException e) // catching the errors
{
System.out.println("index is exceeding");
}
}
System.out.println(Arrays.toString(obj.name));
System.out.println(Arrays.toString(obj.rollno));
}
}
