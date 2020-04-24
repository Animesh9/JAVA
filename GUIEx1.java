import javax.swing.*;
import java.awt.*;
public class GUIEx1
{
public static void main(String [] args)
{
n obj = new n();
}
}
class n extends JFrame
{
public n()
{
JLabel l = new JLabel("Welcome Animesh9");
add(l);
setLayout(new FlowLayout());
setVisible(true);
setSize(700,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
// ... Basic GUI ...
