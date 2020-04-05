import java.io.*;
public class FileEx1
{
public static void main(String [] args) throws IOException
{
File f1 = new File("d:/java/file1.txt");
f1.createNewFile();
System.out.println("Check if file exist or not.\nFile exist " + f1.exists());
System.out.println("File Size " + f1.length());

}
}
