//Assignment Question 3
/*
 Imagine a publishing company that markets both book and audio cassette versions of its works.
 Create a class publication that stores the title (a string) and price (type float) of a publication.
 From this class derive two classes: book, which adds a page count (type int), and tape, which adds
 a playing time in minutes (type float). Each of these three classes should have a proper constructors,
 destructors and display functions to display its data. Write a main() program to test (a) order of 
 constructor and destructor invocation, (b) the book and tape classes by creating instances of them,
 asking the user to fill in data and then displaying the data.  Start with the publication, book, and
 tape classes of  ‘Ques-1’. Add an interface sales that declares functions to hold sales. Include a 
 function to get sales amounts from the user, and a function to display the sales figures. Alter the
 book and tape classes so they are derived from both publication and sales. An object of class book 
 or tape should input and output sales data along with its other data. Write a main() class to create
 a book object and a tape object and exercise their input/output capabilities. 
 */
import java.util.Scanner;
class publication
{
Scanner s = new Scanner(System.in);
String title;
float price;
void getdata()
{
String t;
float p;
System.out.println("Enter title: ");
t = s.nextLine();
System.out.println("Enter price: ");
p = s.nextFloat();
this.title = t;
this.price = p;
}
void putdata()
{
System.out.println("Publication title: " + title + "\n");
System.out.println("Publication price: " + price + "\n");
}
}
class book extends publication
{
int pagecount;
void getdata()
{
super.getdata();
System.out.println("Enter Book Page Count: ");
pagecount = s.nextInt();
}
void putdata()
{
super.putdata();
System.out.println("Book page count: " + pagecount + "\n");
}
}
class tape extends publication
{
Scanner s = new Scanner(System.in);
float ptime;
void getdata()
{
super.getdata();
System.out.println("Enter tape's playing time: ");
ptime = s.nextFloat();
}
void putdata()
{
super.putdata();
System.out.println("Tape's playing time: " + ptime +"\n");
}
}
class Library{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
book b = new book();
tape t = new tape();
b.getdata();
t.getdata();
b.putdata();
t.putdata();
}
}
