package MouseMotion;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
	public Frame()
	{
		Container contentPane = getContentPane();
		setBounds(50,20,1010,670);
		setTitle("Mouse Motion");
		Panel panel1 = new Panel();
		contentPane.add(panel1);
	}
}
