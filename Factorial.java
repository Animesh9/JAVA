import java.util.*;
class Factorial 
{
  public static void main(String args[] ) throws Exception 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pr=1;
    for( int i=1; i<=n; i++)
    {
      pr = pr * i;
    }
    System.out.println(pr); //factorial output
  }
}
