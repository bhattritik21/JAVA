package UI;
import java.awt.*;

public class Myui {​​​
Myui()
{​​​
//Creating Frame
Frame fr=new Frame();
//Creating a label
Label lb = new Label("UserId: ");
//adding label to the frame
fr.add(lb);
//Creating Text Field
TextField t = new TextField();
//adding text field to the frame
fr.add(t);
//setting frame size
fr.setSize(500, 300);
//Setting the layout for the Frame
fr.setLayout(new FlowLayout());
fr.setVisible(true);

}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Myui ex = new Myui();

}
}
​​​
​​​
