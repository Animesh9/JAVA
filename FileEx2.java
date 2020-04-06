import java.io.*;
public class FileEx2
{
public static void main(String [] args) throws IOException
{
int i;
FileOutputStream fout = new FileOutputStream("d:/java/myfile.txt",true);  //This is path in my system
String s= "new day new way";
char ch[] = s.toCharArray();
for(i=0 ; i<s.length() ; i++)
fout.write(ch[i]);
fout.close();
}
}
