import java.io.*;
public class FileEx5
{
    public static void main(String args []) throws IOException
    {
          int ch ;
          BufferedReader bf = new BufferedReader(new FileReader("d:/java/file3.txt"));
          char []s = new char[20];
          bf.read(s,2	,15);
          bf.close();
    }
}
