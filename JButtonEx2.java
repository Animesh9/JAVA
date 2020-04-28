import java.awt.event.*;  
import javax.swing.*;    
public class JButtonEx2 
{  
public static void main(String[] args) 
{  
JFrame f=new JFrame("JButtonEx2");  
final JTextField t = new JTextField();  
t.setBounds(50, 50, 150, 20);  
JButton b = new JButton("Click Here");  
b.setBounds(50,100,95,30);  
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
t.setText("Welcome Animesh Jain");  
}  
});  
f.add(b);
f.add(t);  
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);
}
}
