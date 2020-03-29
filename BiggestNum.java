//Find biggest of three number 
public class BiggestNum {
public static void main(String args[]) {
int num1 = 15 , num2 = 25 , num3 = 41;
if (num1 >= num2 && num1 >= num3)//this will check if num1 is greater than 2 or three
System.out.println( num1 + " is the maximum number.");
else if (num2 >= num1 && num2 >= num3)// if num2 is greater than num3 and num1
System.out.println( num2 + " is the maximum number.");
else//if num 3 is greatest
System.out.println( num3 + " is the maximum number.");
}
}
