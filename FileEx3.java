import java.io.*;
public class FileEx3
{
public static void main(String [] args) throws IOException
{
int i;
FileOutputStream fout = new FileOutputStream("d:/java/file2.txt",true);
FileInputStream fin = new FileInputStream("d:/java/file2.txt");
String s= "new day new way";
char ch[] = s.toCharArray();
for(i=0 ; i<s.length() ; i++)
fout.write(ch[i]);
fout.close();
do 
{
i = fin.read();
if(i!= -1)
System.out.print((char)i);
}while(i!=-1);
fin.close();
}
}
