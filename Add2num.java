//This program will add 2 numbers using command line arguments
public class Add2Num
{
  public static void main (String[] args)
  {
    int a=Integer.parseInt(args[0]);//argument 1
    int b=Integer.parseInt(args[1]);//argument 2
    int c=a+b;//adding arguments
    System.out.println("Add is:"+c);
  }
}
