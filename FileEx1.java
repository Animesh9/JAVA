import java.io.*;
public class FileEx1
{
    public static void main(String [] args) throws IOException
    {
        File f1 = new File("d:/java/file1.txt");   // this path is in my system
        f1.createNewFile();
        System.out.println("Check if file exist or not.\nFile exist " + f1.exists());
        System.out.println("File Size " + f1.length());   // This will give length of file
        System.out.println("File name " + f1.getName());  // This will show the name of file
        System.out.println("Can file read " + f1.canWrite());  
    }
}
