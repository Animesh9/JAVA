public class GenericMethod
{
    public <A> void printArray(A []s)
    {
        for (A x:s)
            System.out.println(x);
    }
    public static void main(String args[])
    {
            GenericMethod gm1 = new GenericMethod();
            String people[] = new String[]{"Ani","Animesh"};
            Integer number[]={9,16,45};
            gm1.printArray(people);
            gm1.printArray(number);
    }
}
