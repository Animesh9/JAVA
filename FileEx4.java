import java.io.*;
public class FileEx4
{
public static void main(String [] args) throws IOException
{
FileWriter fw = new FileWriter("d:/java/file3.txt",true);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("New Day New Way");
bw.close();
}
}
