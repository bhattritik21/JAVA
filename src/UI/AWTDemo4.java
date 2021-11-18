package UI;

import java.awt.*;
import java.awt.event.*;

public class AWTDemo4 {
private static Dialog d;
AWTDemo4(){
Frame f= new Frame();
d = new Dialog(f , "Dialog Example", true);
d.setLayout( new FlowLayout() );
Button b = new Button ("OK");
b.addActionListener ( new ActionListener()
{
public void actionPerformed( ActionEvent e )
{
AWTDemo4.d.setVisible(false);
}
});
d.add( new Label ("Click button to continue."));
d.add(b);
d.setSize(300,300);
d.setVisible(true);
}
public static void main(String args[])
{
new AWTDemo4();
}
}