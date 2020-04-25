import javax.swing.*;
public class JButtonEx1
{
public static void main(String args[])
{
JFrame f=new JFrame("JButton Ex");  
JButton b=new JButton("Click Here");  
b.setBounds(50,100,95,30);  
f.add(b);  
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);
}
}
