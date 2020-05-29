public class StringConcat
{
    public static void main (String[]args)
    {
      String str1 = "This ";
      str1 = str1.concat("is ");
      str1 = str1.concat("a ").concat("Concatenation ").concat("Program.");
      System.out.println(str1);. // This will show the concatenated string
    }
}
