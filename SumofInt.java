public class SumOfInt
{
  public static void main(String args[])
  {
    int x;
    int sum=0;
    System.out.println("All integers which are greater than 40 and less than 250 that are divisible by 5 are :-");
    //...Taking Numbers Between 40 and 250 ...  
    for (x=40;x<=250;x++)
    {
    //... Taking Number Which are divisible by 5 ...
      if (x%5==0)
      {
        System.out.println(" "+ x);
        sum = sum+x;
      }
    }
  //... Printing The Sum ...
  System.out.println("And there sum is "+ sum);
  }
}
