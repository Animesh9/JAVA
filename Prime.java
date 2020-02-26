import java.util.Scanner;
public class Prime{
public static void main(String args[])
{
    int n, i, prime = 0;
    System.out.println("Enter a positive integer: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    for (i = 2; i <= n / 2; ++i) 
    {
        if (n % i == 0) 
        {
            prime = 1;
            break;
        }
    }
    if (n == 1) 
    {
        System.out.println("1 is neither prime nor composite.");
    }
    else 
    {
        if (prime == 0)
            System.out.println(n + "is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}
}
